/**
 * 
 */
package com.platzi.javatests.discounts;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Usuario
 *
 */
public class PriceCalculator {
	
	private List<Double> prices = new ArrayList<Double>();
	private double discount;

	public double getTotal() {
		double total = 0.0;
		for (Double precio : prices) {
			total += precio;
		}
		return total * ((100 - discount) / 100);
		
	}

	public void addPrice(double precio) {
		prices.add(precio);		
	}

	public void setDiscount(double discount) {
		this.discount = discount;		
	}
	
}
