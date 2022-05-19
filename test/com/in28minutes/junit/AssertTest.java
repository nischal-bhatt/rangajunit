package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	public void test() {
		assertEquals(1,1);
	}
	
	@Test
	public void anotherTest()
	{
		boolean bool = ((2*3) == 6);
		assertTrue(bool);
		assertFalse(1==2);
		String x = new String("hey");
		assertNotNull(x);
	}
	

}
