/**
 * 
 */
package com.platzi.javatests.util;

/**
 * @author Usuario
 *
 */
public class StringUtil {

	public static String repeat(String str, int times) {
		if (times < 0) {
			throw new IllegalArgumentException("Times negative is not allowed");
		}
		String result = "";
		for (int i = 0; i < times; i++) {
			result += str;
		}
		return result;
	}
	
	public static boolean isEmpty(String str) {
		if (str == null) {
			return true;
		} else {
			return str.isEmpty() || str == "" || (str.length() != str.trim().length());
		}
	}
}
