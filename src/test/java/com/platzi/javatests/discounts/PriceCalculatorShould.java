/**
 * 
 */
package com.platzi.javatests.discounts;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Usuario
 *
 */
public class PriceCalculatorShould {
	
	PriceCalculator calculator;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		calculator = new PriceCalculator();
	}

	@Test
	public void totalZeroWhenThereArePrices() {
		assertThat(calculator.getTotal(), is(0.0));
	}
	
	@Test
	public void totalIsTheSumOfPrices() {
		calculator.addPrice(15.2);
		calculator.addPrice(10.2);
		assertThat(calculator.getTotal(), is(25.4));

		
	}
	
	@Test
	public void applyDiscountToPrice() {
		calculator.addPrice(100);
		calculator.addPrice(50);
		calculator.addPrice(50);
		calculator.setDiscount(25);
		assertThat(calculator.getTotal(), is(150.0));

		
	}

}
