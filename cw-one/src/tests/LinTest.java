package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import sml.Instruction;
import sml.LinInstruction;

public class LinTest {

	
// Test the superclass constructor
	
	@Test(expected=IllegalArgumentException.class)
	public final void testSuperClassConstructorWithNull() {
		try {
			Instruction superNull = new LinInstruction(null, null);
		} catch (IllegalArgumentException e) {
		      String message = "The arguments cannot be null";
		      assertEquals("Incorrect message", message, e.getMessage());
		      throw e;
		}
		fail("Expected exception did not throw!");
	}
	
	@Test
	public final void testSuperClassConstructorValid() {
		Instruction superValid = new LinInstruction("L1", "lin");
		assertEquals("Incorrect label", "L1", superValid.getLabel());
		assertEquals("Incorrect opcode", "lin", superValid.getOpcode());
	}
	
// Test the subclass constructor
	
	@Test(expected=IllegalArgumentException.class)
	public final void testSubClassConstructorWithNull() {
		try {
			Instruction subNull = new LinInstruction(null, 0, 0);
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
			Instruction subInvalid = new LinInstruction("L1", -1, 0);
		} catch (IllegalArgumentException e) {
		      String message = "Warning: Ignoring instructions that contain invalid registers!";
		      assertEquals("Incorrect message", message, e.getMessage());
		      throw e;
		}
		fail("Expected exception did not throw!");
	}
	
	@Test
	public final void testSubClassConstructorValid() {
		LinInstruction subValid = new LinInstruction("L1", 0, 0);
		assertEquals("Incorrect register", 0, subValid.getRegister());
		assertEquals("Incorrect value", 0, subValid.getValue());
	}
	
// Test the overridden methods

	@Test
	public final void testToString() {
		LinInstruction stringTest = new LinInstruction("L1", 31, 500);
		assertEquals("Incorrect string", "L1: lin register 31 value is 500", stringTest.toString());
	}
	
}
