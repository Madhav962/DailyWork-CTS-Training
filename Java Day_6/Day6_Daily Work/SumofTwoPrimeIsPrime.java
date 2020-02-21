
//Java Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers

package com.day6dailytask;

import java.util.Scanner;

public class SumofTwoPrimeIsPrime {

	public static void main(String[] args) {
		int Sum=0;
		boolean flag=false;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  Number: ");
		int Number= sc.nextInt();
		for(int i=2;i<=Number/2;i++)
		{
			if(PrimeVerification(Number-i))
			{
				if(PrimeVerification(i))
				{
					flag=true;
				    System.out.println("yES THE nUMBER CAN bE eXPRESSED As a Sum of Two prime Numbers");
				    System.out.printf("%d = %d + %d\n", Number, i, Number - i);
				}
			}else
			{
				System.out.println("No the Number Cannot be expressed as A Sum of Two prime Numbers");
				System.out.printf("%d = %d + %d\n", Number, i, Number - i);
			}
		}


	}

	private static boolean PrimeVerification(int N) {
		
		boolean Prime1=true;
		for(int i=2;i<=N/2;i++)
	{
		if(N%i==0)
		{
			Prime1=false;
			break;
		}
		
	}
		return Prime1;

	}
}
