package com.okan;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumWithoutArithmeticOperatorsTest {
	SumWithoutArithmeticOperators testInstance = new SumWithoutArithmeticOperators();

	@Test
	public void testCases() {
		assertEquals(0, testInstance.add(0, 0));
		assertEquals(5, testInstance.add(2, 3));
		assertEquals(7, testInstance.add(0, 7));
		assertEquals(25, testInstance.add(12, 13));
		assertEquals(666, testInstance.add(666, 0));
		assertEquals(75, testInstance.add(53, 22));
		assertEquals(4, testInstance.add(3, 1));
	}

}
