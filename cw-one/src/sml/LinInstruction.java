package sml;

/**
 * This class is a sub-class of the Instruction abstract class
 *
 * @author J Neethling
 */

public class LinInstruction extends Instruction {
    private int register;
    private int value;
    
    public LinInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public LinInstruction(String label, int register, int value) {
        super(label, "lin");
        if (register < 0 || register > 31) {
        	throw new IllegalArgumentException("Warning: Ignoring instructions that contain invalid registers!");
        } else {
        	this.register = register;
        	this.value = value;
        }

    }
    
    // adding accessor methods to improve testibility
    
    public int getRegister() {
    	return register;
    }
    
    public int getValue() {
    	return value;
    }

    @Override
    public void execute(Machine m) {
        m.getRegisters().setRegister(register, value);
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register + " value is " + value;
    }
}
