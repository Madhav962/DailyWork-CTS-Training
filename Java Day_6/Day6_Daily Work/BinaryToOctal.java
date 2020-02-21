package com.day6dailytask;

import java.util.Scanner;

public class BinaryToOctal {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  Binary Number: ");
		long Number= sc.nextLong();
		long Result= DecimalConversion(Number);
		long FinalResult= OctalConversion(Result);
		long NewResult= ReverseNumber(FinalResult);
		System.out.println("Octal Number is: "+NewResult);
		
		
	}

	private static long ReverseNumber(long FinalResult) {
	long NewResult=0,R;
		while(FinalResult!=0)
		{
		            R = FinalResult % 10;
		            NewResult = NewResult * 10 + R;
		            FinalResult /= 10;
		        
		}
		
		return NewResult;
	}

	private static long DecimalConversion(long number) {
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

	private static long OctalConversion(long Result) {
		int i = String.valueOf(Result).length()-1;
		long FinalResult=0,Remainder;
		while(Result!=0)
		{
		 Remainder= Result%8;
		 FinalResult += Remainder *Math.pow(10, i);
		 Result=Result/8;
		 --i;
		
		}
		return FinalResult;
	}

}
