package com.trainingdata;
import java.lang.Math;
import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter  Number: ");
    	double Number = input.nextInt();
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter the Power of Number: ");
    	double Power = input.nextInt();
		double Result;
		Result= Math.pow(Number, Power);
		System.out.println("The Power Of the GivenNumber is: "+ Result);

	}

}
