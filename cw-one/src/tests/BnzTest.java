package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import sml.BnzInstruction;
import sml.Instruction;

public class BnzTest {

	// Test the superclass constructor
	
	@Test(expected=IllegalArgumentException.class)
	public final void testSuperClassConstructorWithNull() {
		try {
			Instruction superNull = new BnzInstruction(null, null);
		} catch (IllegalArgumentException e) {
		      String message = "The arguments cannot be null";
		      assertEquals("Incorrect message", message, e.getMessage());
		      throw e;
		}
		fail("Expected exception did not throw!");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testSuperClassConstructorWithWrongOp() {
		try {
			Instruction superWrong = new BnzInstruction("L1", "foo");
		} catch (IllegalArgumentException e) {
		      String message = "The operation is not recognized";
		      assertEquals("Incorrect message", message, e.getMessage());
		      throw e;
		}
		fail("Expected exception did not throw!");
	}

	@Test
	public final void testSuperClassConstructorValid() {
		Instruction superValid = new BnzInstruction("L1", "lin");
		assertEquals("Incorrect label", "L1", superValid.getLabel());
		assertEquals("Incorrect opcode", "lin", superValid.getOpcode());
	}
	
// Test the subclass constructor
	
	@Test(expected=IllegalArgumentException.class)
	public final void testSubClassConstructorWithNull() {
		try {
			Instruction subNull = new BnzInstruction(null, 0, "L1");
		} catch (IllegalArgumentException e) {
		      String message = "The arguments cannot be null";
		      assertEquals("Incorrect message", message, e.getMessage());
		      throw e;
		}
		fail("Expected exception did not throw!");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testSubClassConstructorWithInvalidRegister() {
		try {
			Instruction subInvalid = new BnzInstruction("L1", -1, "L1");
		} catch (IllegalArgumentException e) {
		      String message = "Warning: Ignoring instructions that contain invalid registers!";
		      assertEquals("Incorrect message", message, e.getMessage());
		      throw e;
		}
		fail("Expected exception did not throw!");
	}
	
	@Test
	public final void testSubClassConstructorValid() {
		BnzInstruction subValid = new BnzInstruction("L2", 0, "L1");
		assertEquals("Incorrect register", 0, subValid.getRegister());
		assertEquals("Incorrect label", "L1", subValid.getNextI());
	}
	
// Test the overridden methods

	@Test
	public final void testToString() {
		BnzInstruction stringTest = new BnzInstruction("L2", 31, "L1");
		assertEquals("Incorrect string", "L2: bnz register 31 go to L1", stringTest.toString());
	}

}
