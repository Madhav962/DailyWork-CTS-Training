package com.trainingdata;

import java.util.Scanner;

public class ArmstrongBetweenNumbers {
	public static void main(String args[])
	{
		
		Scanner Num = new Scanner(System.in);
		System.out.print("Enter a  Starting Number: ");
		int Number = Num.nextInt();
		System.out.print("Enter a  Ending Number: ");
		int Number2 = Num.nextInt();
		
	for(int i = Number + 1; i < Number2; ++i) {
        int c = 0;
        int Result = 0;
        int ResultantNumber = i;

     
        while (ResultantNumber != 0) {
            ResultantNumber /= 10;
            ++c;
        }

        ResultantNumber = i;

       
        while (ResultantNumber != 0) {
            int remainder = ResultantNumber % 10;
            Result += Math.pow(remainder, c);
            ResultantNumber /= 10;
        }

        if (Result == i)
            System.out.print(i + " ");
    }
}
}


