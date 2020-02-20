package com.trainingdata;
import java.util.Scanner;

public class DigitsCount {

	public static void main(String[] args) {
		int count=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = input. nextInt();
		while(number!=0)
		{
			number/=10;
			count++;
		}
		System.out.print(count);

	}

}
