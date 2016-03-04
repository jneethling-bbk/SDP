package sml;

/**
 * This class is a sub-class of the Instruction abstract class
 *
 * @author J Neethling
 */

public class MultiplyInstruction extends Instruction {

    private int result;
    private int op1;
    private int op2;

    public MultiplyInstruction(String label, String op) {
        super(label, op);
    }

    public MultiplyInstruction(String label, int result, int op1, int op2) {
        this(label, "mul");
        if (result < 0 || result > 31 || op1 < 0 || op1 > 31 || op2 < 0 || op2 > 31) {
        	throw new IllegalArgumentException("Warning: Ignoring instructions that contain invalid registers!");
        } else {
        	this.result = result;
        	this.op1 = op1;
        	this.op2 = op2;
        }
    }
    
    // adding accessor methods to improve testibility
    
    public int getRegister() {
    	return result;
    }
    
    public int getValue1() {
    	return op1;
    }
    
    public int getValue2() {
    	return op2;
    }

    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 * value2);
    }

    @Override
    public String toString() {
        return super.toString() + " " + op1 + " * " + op2 + " to " + result;
    }
	
}
