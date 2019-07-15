package com.platzi.javatests.numbers;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class RomanNumeralsTest {

	@Test
	public void numeroUnoArabigoDeberiaRetornarRomanoI() {
		assertThat(RomanNumerals.arabicToRoman(1), is("I"));
	}
	
	@Test
	public void numeroDosArabigoDeberiaRetornarRomanoII() {
		assertThat(RomanNumerals.arabicToRoman(2), is("II"));
	}

}
