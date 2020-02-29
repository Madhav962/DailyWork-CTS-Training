package com.day11.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.day11.training.clas.Calculator;

public class CalculatorTest {

	private static Calculator calculator;
	
	@BeforeClass
	public static void init()
	{
		calculator = new Calculator();
		System.out.println("Object Created!!!!!");
		
	}
	
	@AfterClass
	public static void destroy()
	{
		calculator = null;
		System.out.println("Object Destroyed!!!!!");
	}
	@Ignore
	@Test
	public void test_add_sucesss() {
		assertEquals(17, calculator.add(12, 5));
		System.out.println("Inside Add Test");
	}
	@Ignore
	@Test
	public void substract_test_success()
	{
		assertEquals(7, calculator.substract(5, 12));
		System.out.println("Inside Substract Test");
	}
	@Ignore
	@Test
	public void multiplication_test_success()
	{
		assertEquals(15, calculator.multiply(5, 3));
		System.out.println("Inside Multiplication Test");
	}
	@Ignore
	@Test
	public void Divide_test_success()
	{
		assertEquals(1, calculator.divide(3, 3));
		System.out.println("Inside Division Test");
	}
	
	@Test
	public void primeNumber_test_success()
	{
		assertEquals(true, calculator.isPrime(5));
		System.out.println("Inside prime Test");
	}
	
	@Test
	public void primeNumber_test_failure()
	{
		assertEquals(false, calculator.isPrime(4));
		System.out.println("Inside primeFailure Test");
	}

}
