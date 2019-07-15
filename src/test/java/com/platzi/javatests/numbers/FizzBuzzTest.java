package com.platzi.javatests.numbers;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void numeroDivisiblePorTresDeberiaRetornarFizz() {
		assertThat(FizzBuzz.fizzBuzz(3), is(FizzBuzz.fizz));
		assertThat(FizzBuzz.fizzBuzz(6), is(FizzBuzz.fizz));
		assertThat(FizzBuzz.fizzBuzz(9), is(FizzBuzz.fizz));
		assertThat(FizzBuzz.fizzBuzz(12), is(FizzBuzz.fizz));
		
	}
	
	@Test
	public void numeroDivisiblePorCincoDeberiaRetornarBuzz() {
		assertThat(FizzBuzz.fizzBuzz(5), is(FizzBuzz.buzz));
		assertThat(FizzBuzz.fizzBuzz(10), is(FizzBuzz.buzz));
		assertThat(FizzBuzz.fizzBuzz(25), is(FizzBuzz.buzz));
		assertThat(FizzBuzz.fizzBuzz(20), is(FizzBuzz.buzz));
		
	}
	
	@Test
	public void numeroDivisiblePorTresYCincoDeberiaRetornarFizzBuzz() {
		assertThat(FizzBuzz.fizzBuzz(15), is(FizzBuzz.fizz + FizzBuzz.buzz));
		assertThat(FizzBuzz.fizzBuzz(30), is(FizzBuzz.fizz + FizzBuzz.buzz));
		assertThat(FizzBuzz.fizzBuzz(60), is(FizzBuzz.fizz + FizzBuzz.buzz));
		assertThat(FizzBuzz.fizzBuzz(45), is(FizzBuzz.fizz + FizzBuzz.buzz));
		
	}
	
	@Test
	public void numeroNoDivisiblePorTresYCincoDeberiaRetornarMismoNumero() {
		assertThat(FizzBuzz.fizzBuzz(1), is("1"));
		assertThat(FizzBuzz.fizzBuzz(7), is("7"));
		assertThat(FizzBuzz.fizzBuzz(4), is("4"));
		assertThat(FizzBuzz.fizzBuzz(2), is("2"));
		
	}


}
