/**
 * 
 */
package com.platzi.javatests.util;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Usuario
 *
 */
public class DateUtilLeapYearShould {
	
	 /*
    -All years divisible by 400 ARE leap years (1600, 2000, 2400),
    -All years divisible by 100 but not by 400 are NOT leap years (1700, 1800, 1900),
    -All years divisible by 4 but not by 100 ARE leap years (1996, 2004, 2008),
    -All years not divisible by 4 are NOT leap years (2017, 2018, 2019).
   */
	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link java.lang.Object#finalize()}.
	 */
	@Test
	public void returnTrueWhenYearIsDivisibleBy400() {
		assertThat(DateUtil.isLeapYear(1600), is(true));
		assertThat(DateUtil.isLeapYear(2000), is(true));
		assertThat(DateUtil.isLeapYear(2400), is(true));
	}
	//All years divisible by 100 but not by 400 are NOT leap years (1700, 1800, 1900)
	@Test
	public void returnFalseWhenYearIsDivisibleBy100ButNotDivisibleBy400() {
		assertThat(DateUtil.isLeapYear(1700), is(false));
		assertThat(DateUtil.isLeapYear(1800), is(false));
		assertThat(DateUtil.isLeapYear(1900), is(false));
		
	}
	// All years divisible by 4 but not by 100 ARE leap years (1996, 2004, 2008),
	@Test
	public void returnTrueWhenYearIsDivisibleBy4ButNotDivisibleBy100() {
		assertThat(DateUtil.isLeapYear(1996), is(true));
		assertThat(DateUtil.isLeapYear(2004), is(true));
		assertThat(DateUtil.isLeapYear(2008), is(true));
	}
	//-All years not divisible by 4 are NOT leap years (2017, 2018, 2019).
	
	@Test
	public void returnFalseWhenYearIsNotDivisibleBy4() {
		assertThat(DateUtil.isLeapYear(2017), is(false));
		assertThat(DateUtil.isLeapYear(2018), is(false));
		assertThat(DateUtil.isLeapYear(2019), is(false));
	}
}
