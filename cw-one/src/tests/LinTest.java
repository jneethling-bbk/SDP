package tests;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import sml.Instruction;
import sml.LinInstruction;

public class LinTest {

// Test the superclass constructors
	
	@Test(expected=IllegalArgumentException.class)
	public final void testSuperClassConstructorWithNull() {
		try {
			Instruction SuperNull = new LinInstruction(null, null);
		} catch (IllegalArgumentException e) {
		      String message = "The arguments cannot be null";
		      assertEquals(message, e.getMessage());
		      throw e;
		}
		fail("Expected exception did not throw!");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testSuperClassConstructorWithWrongOp() {
		try {
			Instruction SuperWrong = new LinInstruction("L1", "foo");
		} catch (IllegalArgumentException e) {
		      String message = "The operation is not recognized";
		      assertEquals(message, e.getMessage());
		      throw e;
		}
		fail("Expected exception did not throw!");
	}
	
	@Test
	public final void testLinInstructionStringString() {	
		fail("Not yet implemented"); // TODO
		
	}

	@Test
	public final void testLinInstructionStringIntInt() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testToString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testExecute() {
		fail("Not yet implemented"); // TODO
	}

}
