package sml;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * The translator of a SML program.
 */
public class Translator {

    private static final String PATH = "/Users/Brak/git/SDP/cw-one/src/";
    // word + line is the part of the current line that's not yet processed
    // word has no whitespace
    // If word and line are not empty, line begins with whitespace
    private String line = "";
    private Labels labels; // The labels of the program being translated
    private ArrayList<Instruction> program; // The program to be created
    private String fileName; // source file of SML code

    public Translator(String fileName) {
        this.fileName = PATH + fileName;
    }

    // translate the small program in the file into lab (the labels) and
    // prog (the program)
    // return "no errors were detected"
    public boolean readAndTranslate(Labels lab, ArrayList<Instruction> prog)  {

        try (Scanner sc = new Scanner(new File(fileName))) {
            // Scanner attached to the file chosen by the user
            labels = lab;
            labels.reset();
            program = prog;
            program.clear();

            try {
                line = sc.nextLine();
            } catch (NoSuchElementException ioE) {
                return false;
            }

            // Each iteration processes line and reads the next line into line
            while (line != null) {
                // Store the label in label
                String label = scan();

                if (label.length() > 0) {
                    Instruction ins = getInstruction(label);
                    if (ins != null) {
                        labels.addLabel(label);
                        program.add(ins);
                    }
                }

                try {
                    line = sc.nextLine();
                } catch (NoSuchElementException ioE) {
                    return false;
                }
            }
        } catch (IOException ioE) {
            System.out.println("File: IO error " + ioE.getMessage());
            System.exit(-1);
            return false;
        }
        return true;
    }

    // line should consist of an SML instruction, with its label already
    // removed. Translate line into an instruction with label label
    // and return the instruction
    public Instruction getInstruction(String label) {
        int s1; // Possible operands of the instruction
        int s2;
        int r;
        String x;

//-----Reflection code------------------------------------------------ 
//        String ins = scan();
//        
//		// Translate the package name into an absolute path
//		String name = new String("sml");
//        if (!name.startsWith("/")) {
//            name = "/" + name;
//        }        
//        name = name.replace('.','/');	
//				
//        // Get a File object for the package
//        URL url = Translator.class.getResource(name);
//        File directory = new File(url.getFile());
//	
//        if (directory.exists()) {
//        	// Get the list of the files contained in the package and add only the names of
//        	// subclasses of Instruction to a List
//        	String [] allfiles = directory.list();
//        	ArrayList<String> instructionClassNames = new ArrayList<>();
//        	        
//        	for (int i=0; i<allfiles.length; i++) {        		
//          	Class testClass = allfiles[i];
//				Class superClass = testClass.getSuperclass();      
//        		if (allfiles[i].endsWith(".class") 
//        				&& superClass.equals(Instruction.class)) {
//        			String classname = allfiles[i].substring(0,allfiles[i].length()-6);
//        			instructionClassNames.add(classname);
//        		}
//        	}
//        	      	
//        	for (int i=0; i<instructionClassNames.size(); i++) { 
//                             
//                try {
//                	
//             	   if (line.equals(""))
//            		   return null;
//                	
//                	// Try to reference the correct class and constructor objects
//                	Class cl = Class.forName("sml."+ instructionClassNames.get(i));
//                    Constructor cons = cl.getConstructor(String.class, String.class);
//                    Instruction temp = (Instruction) cons.newInstance(label, ins);
//                    if (temp.getOpcode().equals(ins)) {
//                    	Field[] fields = cl.getDeclaredFields();
//                    	for (Field f : fields) {
//                    		f.setAccessible(true);
//                    		if (f.getType().equals(int.class)) {
//                    			f.setInt(temp, scanInt());
//                    		} else {
//                    			f.set(temp, scan());
//                    		}
//                    	}
//                    return temp;
//                    }
//                    
//                } catch (ClassNotFoundException cnfex) {
//                    System.err.println(cnfex);
//                } catch (InstantiationException iex) {
//                    // We try to instantiate an interface
//                    // or an object that does not have a 
//                    // default constructor
//                } catch (IllegalAccessException iaex) {
//                    // The class is not public
//                } catch (SecurityException e) {
//					// TODO Auto-generated catch block
//					//e.printStackTrace();
//				} catch (NoSuchMethodException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IllegalArgumentException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (InvocationTargetException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//            }
//        }
//        return null;
//    }
//--------Original code-------------------------------------------------------
       try {
    	   if (line.equals(""))
    		   return null;

    	   String ins = scan();
    	   switch (ins) {
            	case "add":
            		r = scanInt();
            		s1 = scanInt();
            		s2 = scanInt();
            		return new AddInstruction(label, r, s1, s2);
            	case "lin":
            		r = scanInt();
            		s1 = scanInt();
            		return new LinInstruction(label, r, s1);
            	case "sub":
            		r = scanInt();
            		s1 = scanInt();
            		s2 = scanInt();
            		return new SubtractInstruction(label, r, s1, s2);
            	case "mul":
            		r = scanInt();
            		s1 = scanInt();
            		s2 = scanInt();
            		return new MultiplyInstruction(label, r, s1, s2);
            	case "div":
            		r = scanInt();
            		s1 = scanInt();
            		s2 = scanInt();
            		return new DivideInstruction(label, r, s1, s2);
            	case "out":
            		r = scanInt();
            		return new OutInstruction(label, r);
            	case "bnz":
            		r = scanInt();
            		x = scan();
            		return new BnzInstruction(label, r, x);
    	   }
         
       } catch (IllegalArgumentException e) {
    	   System.out.println(e.getMessage());
       
       } catch (SecurityException e) {
    	   e.printStackTrace();
       }
        return null;

    }

    /*
     * Return the first word of line and remove it from line. If there is no
     * word, return ""
     */
    private String scan() {
        line = line.trim();
        if (line.length() == 0)
            return "";

        int i = 0;
        while (i < line.length() && line.charAt(i) != ' ' && line.charAt(i) != '\t') {
            i = i + 1;
        }
        String word = line.substring(0, i);
        line = line.substring(i);
        return word;
    }

    // Return the first word of line as an integer. If there is
    // any error, return the maximum int
    private int scanInt() {
        String word = scan();
        if (word.length() == 0) {
            return Integer.MAX_VALUE;
        }

        try {
            return Integer.parseInt(word);
        } catch (NumberFormatException e) {
            return Integer.MAX_VALUE;
        }
    }
}