/**
 * 
 */
package com.platzi.javatests.numbers;

/**
 * @author Usuario
 *
 */
public class FizzBuzz {
	
	public static String fizz = "fizz";
	public static String buzz = "buzz";
	
	public static String fizzBuzz(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return fizz + buzz;
		} else if (number % 3 == 0) {
			return fizz;
		} else if (number % 5 == 0) {
			return buzz;
		} else {
			return String.valueOf(number);
		}
		
	}

}
