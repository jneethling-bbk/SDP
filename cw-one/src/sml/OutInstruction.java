package sml;

/**
 * This class is a sub-class of the Instruction abstract class
 *
 * @author J Neethling
 */

public class OutInstruction extends Instruction {

    private int register;

    public OutInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public OutInstruction(String label, int register) {
        super(label, "out");
        if (register < 0 || register > 31) {
        	throw new IllegalArgumentException("Warning: Ignoring instructions that contain invalid registers!");
        } else {
        	this.register = register;
        }

    }
    
    // adding accessor methods to improve testibility
    
    public int getRegister() {
    	return register;
    }
    
    @Override
    public void execute(Machine m) {      
        System.out.println(m.getRegisters().getRegister(register));
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register;
    }
	
}
