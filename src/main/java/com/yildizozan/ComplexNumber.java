package com.yildizozan;

public class ComplexNumber {
	float real, imaginary;

	public ComplexNumber(float real, float imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public static ComplexNumber addition(ComplexNumber number1, ComplexNumber number2) {
		float real = number1.real + number2.real;
		float imaginary = number1.imaginary + number2.imaginary;
		return new ComplexNumber(real, imaginary);
	}

	public float getReal() {
		return real;
	}

	public float getImaginary() {
		return imaginary;
	}

}
