package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import sml.Instruction;
import sml.MultiplyInstruction;

public class MulTest {

	// Test the superclass constructor
	
	@Test(expected=IllegalArgumentException.class)
	public final void testSuperClassConstructorWithNull() {
		try {
			Instruction superNull = new MultiplyInstruction(null, null);
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
			Instruction superWrong = new MultiplyInstruction("L1", "foo");
		} catch (IllegalArgumentException e) {
		      String message = "The operation is not recognized";
		      assertEquals("Incorrect message", message, e.getMessage());
		      throw e;
		}
		fail("Expected exception did not throw!");
	}

	@Test
	public final void testSuperClassConstructorValid() {
		Instruction superValid = new MultiplyInstruction("L1", "lin");
		assertEquals("Incorrect label", "L1", superValid.getLabel());
		assertEquals("Incorrect opcode", "lin", superValid.getOpcode());
	}
	
// Test the subclass constructor
	
	@Test(expected=IllegalArgumentException.class)
	public final void testSubClassConstructorWithNull() {
		try {
			Instruction subNull = new MultiplyInstruction(null, 0, 0, 0);
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
			Instruction subInvalid = new MultiplyInstruction("L1", -1, 0, 0);
		} catch (IllegalArgumentException e) {
		      String message = "Warning: Ignoring instructions that contain invalid registers!";
		      assertEquals("Incorrect message", message, e.getMessage());
		      throw e;
		}
		fail("Expected exception did not throw!");
	}
	
	@Test
	public final void testSubClassConstructorValid() {
		MultiplyInstruction subValid = new MultiplyInstruction("L1", 2, 1, 0);
		assertEquals("Incorrect register", 2, subValid.getRegister());
		assertEquals("Incorrect register", 1, subValid.getValue1());
		assertEquals("Incorrect register", 0, subValid.getValue2());
	}
	
// Test the overridden methods

	@Test
	public final void testToString() {
		MultiplyInstruction stringTest = new MultiplyInstruction("L1", 2, 1, 0);
		assertEquals("Incorrect string", "L1: mul 1 * 0 to 2", stringTest.toString());
	}

}
