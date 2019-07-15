/**
 * 
 */
package com.platzi.javatests.player;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author Usuario
 *
 */
public class PlayerTest {

	@Test
	public void loosesWhenDiceNumberisTooLow() {
		//Dice dice = new Dice(6);
		Dice dice = Mockito.mock(Dice.class);
		Mockito.when(dice.roll()).thenReturn(2);
		
		Player player = new Player(dice, 3);
		//assertEquals(false, player.play());
		assertFalse(player.play());
	}
	
	@Test
	public void winsWhenDiceNumberisBig() {
		//Dice dice = new Dice(6);
		Dice dice = Mockito.mock(Dice.class);
		Mockito.when(dice.roll()).thenReturn(4);
		
		Player player = new Player(dice, 3);
		//assertEquals(true, player.play());
		assertTrue(player.play());
	}

}
