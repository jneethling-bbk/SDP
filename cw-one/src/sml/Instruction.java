package sml;

/**
 * This class is the superclass of the classes for machine instructions
 *
 * @author J Neethling
 */

public abstract class Instruction {
    protected String label;
    protected String opcode;

    // Constructor: an instruction with label l and opcode op
    // (op must be an operation of the language)

    public Instruction(String l, String op) {
        if (l == null || op == null) {
        	throw new IllegalArgumentException("The arguments cannot be null");
        } else if (!op.equals("lin") 
        		&& !op.equals("add") 
        		&& !op.equals("sub") 
        		&& !op.equals("mul") 
        		&& !op.equals("div")
        		&& !op.equals("out")
        		&& !op.equals("bnz")) {
        	throw new IllegalArgumentException("The operation is not recognized");
        } else {
        	this.label = l;
        	this.opcode = op;
        }
    }
    
    // accessors added to improve testibility
    
    public String getLabel() {
    	return label;
    }
    
    public String getOpcode() {
    	return opcode;
    }

    // = the representation "label: opcode" of this Instruction

    @Override
    public String toString() {
        return label + ": " + opcode;
    }

    // Execute this instruction on machine m.

    public abstract void execute(Machine m);
}
