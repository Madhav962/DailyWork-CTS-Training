package com.trainingdata;

import java.util.Scanner;

public class GCDREcursion {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1stNumber");
		int number = sc.nextInt();
		System.out.println("Enter 2ndNumber");
		int number2 = sc.nextInt();
		
		int GCD = GCD(number, number2);

        System.out.println("G.C.D is: "+ GCD);
    }

    public static int GCD(int n1, int n2)
    {
        if (n2 != 0)
            return GCD(n2, n1 % n2);
        else
            return n1;
    }

	}


