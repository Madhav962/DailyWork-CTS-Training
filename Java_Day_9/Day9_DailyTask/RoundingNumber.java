//Round a Number using format

package com.array.day9_dailytask;

import java.util.Scanner;

public class RoundingNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Float Number: ");
		double N= sc.nextDouble();
		System.out.format("%.2f", N);

	}

}
