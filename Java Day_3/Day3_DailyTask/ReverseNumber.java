package com.trainingdata;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
    	int Number = input.nextInt();
		int Remainder,ReverseNumber=0;
		
		while(Number!=0)
		{
			Remainder= Number%10;
			ReverseNumber= ReverseNumber*10+ Remainder;
			Number /= 10;
		}
System.out.println("Reverse Number is :"+ReverseNumber);
	}

}
