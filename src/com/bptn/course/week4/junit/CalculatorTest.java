package com.bptn.course.week4.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	Calculator calculator=new Calculator();
	
	
	@Test
	public void testAdd() {
		assertEquals(5,calculator.add(2, 3));
		assertEquals(-1,calculator.add(-2, 1));	
	}
	
	@Test
	public void testSubstract() {
		assertEquals(-1,calculator.substract(2, 3));
		assertEquals(-3,calculator.substract(-2, 1));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(6,calculator.multiply(2, 3));
		assertEquals(2,calculator.multiply(-1, -2));
		assertEquals(-4,calculator.multiply(2, -2));
	}
	
	@Test
	public void testDivide() {
		assertEquals(2,calculator.divide(6, 3));
		assertEquals(-2,calculator.divide(-6, 3));
		assertEquals(2,calculator.divide(-6,-3));
	}
	
	//to indicate the testDivideByZero
	@Test(expected=IllegalArgumentException.class)
	public void testDivideByZero() {
		calculator.divide(6, 0);
	}

}
