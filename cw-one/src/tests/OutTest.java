package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import sml.Instruction;
import sml.OutInstruction;

public class OutTest {

	// Test the superclass constructor
	
		@Test(expected=IllegalArgumentException.class)
		public final void testSuperClassConstructorWithNull() {
			try {
				Instruction superNull = new OutInstruction(null, null);
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
				Instruction superWrong = new OutInstruction("L1", "foo");
			} catch (IllegalArgumentException e) {
			      String message = "The operation is not recognized";
			      assertEquals("Incorrect message", message, e.getMessage());
			      throw e;
			}
			fail("Expected exception did not throw!");
		}

		@Test
		public final void testSuperClassConstructorValid() {
			Instruction superValid = new OutInstruction("L1", "lin");
			assertEquals("Incorrect label", "L1", superValid.getLabel());
			assertEquals("Incorrect opcode", "lin", superValid.getOpcode());
		}
		
	// Test the subclass constructor
		
		@Test(expected=IllegalArgumentException.class)
		public final void testSubClassConstructorWithNull() {
			try {
				Instruction subNull = new OutInstruction(null, 0);
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
				Instruction subInvalid = new OutInstruction("L1", -1);
			} catch (IllegalArgumentException e) {
			      String message = "Warning: Ignoring instructions that contain invalid registers!";
			      assertEquals("Incorrect message", message, e.getMessage());
			      throw e;
			}
			fail("Expected exception did not throw!");
		}
		
		@Test
		public final void testSubClassConstructorValid() {
			OutInstruction subValid = new OutInstruction("L1", 0);
			assertEquals("Incorrect register", 0, subValid.getRegister());
		}
		
	// Test the overridden methods

		@Test
		public final void testToString() {
			OutInstruction stringTest = new OutInstruction("L1", 31);
			assertEquals("Incorrect string", "L1: out register 31", stringTest.toString());
		}

}
