package com.trainingdata;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		int Result=0, TotalNumber=0,Remainder;
		Scanner Num = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int Number = Num.nextInt();
		TotalNumber=Number;
		while(Number!=0)
		{
			Remainder= Number%10;
			Result+= Math.pow(Remainder, 3);
			Number/=10;
		}
		
		if(TotalNumber==Result)
		{
			System.out.println("The Number is a Armstrong Number");
		
		}
		else
		{
			System.out.println("The Number is Not a Armstrong Number");
		}

	}

}
