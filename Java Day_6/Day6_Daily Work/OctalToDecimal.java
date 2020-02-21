//Java Program to Convert Octal Number to Decimal 

package com.day6dailytask;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  Octal Number: ");
		long Number= sc.nextLong();
		long Result= OctalConversion(Number);
		System.out.println("Decimar Number is: "+Result);

	}

	private static long OctalConversion(long number) {
		long i=0,Result=0,Remainder;
		while(number!=0)
		{
		 Remainder= number%10;
		 Result += Remainder *Math.pow(8, i);
		 number=number/10;
		 ++i;
		
		}
		return Result;
		
	
	}

}
