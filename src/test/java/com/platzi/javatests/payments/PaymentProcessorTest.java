package com.platzi.javatests.payments;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class PaymentProcessorTest {
	private PaymentGateway paymentGateway;
	PaymentProcessor paymentProcessor;
	
	@Before
	public void setup() {
		paymentGateway = Mockito.mock(PaymentGateway.class);
		paymentProcessor = new PaymentProcessor(paymentGateway);
	}

	@Test
	public void paymentIsCorrect() {
		
		Mockito.when(paymentGateway.requestPayment(Mockito.any()))
				.thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

		
		assertTrue(paymentProcessor.makePayment(1000));
	}
	
	@Test
	public void paymentIsWrong() {
		
		Mockito.when(paymentGateway.requestPayment(Mockito.any()))
				.thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

	
		assertFalse(paymentProcessor.makePayment(1000));
	}

}
