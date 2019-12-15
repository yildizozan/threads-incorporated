package com.yildizozan;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexNumberTest {

	@Test
	public void addition() {
		ComplexNumber number1 = new ComplexNumber(0, 1);
		ComplexNumber number2 = new ComplexNumber(0, 1);

		ComplexNumber result = ComplexNumber.addition(number1, number2);
		assertEquals(result.getReal(), 0, .00001);
		assertEquals(result.getImaginary(), 2, .00001);
	}

	@Test
	public void getReal() {
		ComplexNumber number = new ComplexNumber(0, 1);
		assertEquals(number.getReal(), 0.0, .0001);
	}

	@Test
	public void getImaginary() {
		ComplexNumber number = new ComplexNumber(0, 1);
		assertEquals(number.getImaginary(), 1, .0001);
	}
}