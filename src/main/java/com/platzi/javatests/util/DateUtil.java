/**
 * 
 */
package com.platzi.javatests.util;

/**
 * @author Usuario
 *
 */
public class DateUtil {
	
	public static boolean isLeapYear(int year) {
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
			return true;
		} else {
			return false;
		}
	}

}
