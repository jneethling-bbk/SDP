package sml;

/**
 * This class is a sub-class of the Instruction abstract class
 *
 * @author J Neethling
 */

public class BnzInstruction extends Instruction {

    private int register;
    private String nextI;

    public BnzInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public BnzInstruction(String label, int register, String nextI) {
        super(label, "bnz");
        if (register < 0 || register > 31) {
        	throw new IllegalArgumentException("Warning: Ignoring instructions that contain invalid registers!");
        } else {
        	this.register = register;
        	this.nextI = nextI;
        }

    }
    
    // adding accessor methods to improve testibility
    
    public int getRegister() {
    	return register;
    }
    
    public String getNextI() {
    	return nextI;
    }
    
    @Override
    public void execute(Machine m) {      
        if (m.getRegisters().getRegister(register) != 0) {
        	m.setPc(m.getLabels().indexOf(nextI));
        }
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register + " go to " + nextI;
    }
	
}
