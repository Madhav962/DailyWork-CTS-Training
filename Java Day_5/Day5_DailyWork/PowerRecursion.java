package com.trainingdata;

import java.util.Scanner;

public class PowerRecursion {
public static void main(String args[]) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Base to be provided");
	int Base = sc.nextInt();
	System.out.println("Enter Power to be Raised");
	int powerRaised = sc.nextInt();
	int result = power(Base, powerRaised);

    System.out.println("Result is : "+result);
}

public static int power(int base, int powerRaised) {
    if (powerRaised != 0)
        return (base * power(base, powerRaised - 1));
    else
        return 1;
}
}
