/**
 * 
 */
package com.platzi.javatests.player;

import java.util.Random;

/**
 * @author Usuario
 *
 */
public class Dice {
	
	private int sides;

	public Dice(int sides) {
		super();
		this.sides = sides;
	}
	
	public int roll() {
		return new Random().nextInt(sides) + 1;
	}

}
