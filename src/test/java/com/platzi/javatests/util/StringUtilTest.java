package com.platzi.javatests.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StringUtilTest {

	// public static void main(String[] args) {

	@Test
	public void testRepeat() {

		/*
		 * assertEquals(StringUtil.repeat("hola", 3), "holaholahola");
		 * assertEquals(StringUtil.repeat("hola", 1), "hola");
		 */

	}

	@Test
	public void testOnce() {
		assertEquals("hola", StringUtil.repeat("hola", 1));
	}
	@Test
	public void testMultipleTimes() {
		assertEquals("holaholahola", StringUtil.repeat("hola", 3));
	}
	
	@Test
	public void testZeroTimes() {
		assertEquals("", StringUtil.repeat("hola", 0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeTimes() {
		assertEquals("", StringUtil.repeat("hola", -1));
	}

	/*
	 * private static void assertEquals(String actual, String expected) {
	 * 
	 * if (!actual.equals(expected)) { throw new RuntimeException(actual +
	 * " is not equal to expected " + expected); } }
	 */
	
	@Test
	public void notEmptyString() {
		assertFalse(StringUtil.isEmpty("Juan"));
	}
	
	@Test
	public void isEmptyString() {
		assertTrue(StringUtil.isEmpty(""));
	}
	
	@Test
	public void nullIsEmptyString() {
		assertTrue(StringUtil.isEmpty(null));
	}
	
	@Test
	public void stringContainsSpaceIsEmpty() {
		assertTrue(StringUtil.isEmpty("Palabra "));
	}
}