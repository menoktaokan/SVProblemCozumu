package com.okan;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckingUniqueTest {

	CheckingUnique testInstance = new CheckingUnique();

	@Test
	public void testCases() {
		assertEquals(false, testInstance.isUnique("tree"));
		assertEquals(true, testInstance.isUnique("home"));
		assertEquals(true, testInstance.isUnique(""));
		assertEquals(true, testInstance.isUnique("123456789"));
		assertEquals(false, testInstance.isUnique("good4you"));
		assertEquals(true, testInstance.isUnique("ewg0ECT?:)'^%/"));
		assertEquals(false, testInstance.isUnique("twoandahalfmen"));
	}

}
