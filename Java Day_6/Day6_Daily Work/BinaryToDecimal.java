//Java Program to Convert Binary Number to Decimal 

package com.day6dailytask;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  Binary Number: ");
		long Number= sc.nextLong();
		long Result= BinaryConversion(Number);
		System.out.println("Decimar Number is: "+Result);

	}

	private static long BinaryConversion(long number) {
		long i=0,Result=0,Remainder;
		while(number!=0)
		{
		 Remainder= number%10;
		 Result += Remainder *Math.pow(2, i);
		 number=number/10;
		 ++i;
		
		}
		return Result;
		
	
	}

}
