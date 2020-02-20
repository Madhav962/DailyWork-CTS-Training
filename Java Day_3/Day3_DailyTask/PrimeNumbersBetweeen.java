package com.trainingdata;

import java.util.Scanner;

public class PrimeNumbersBetweeen {

	public static void main(String[] args) {
	      
		Scanner Num = new Scanner(System.in);
		System.out.print("Enter a  Starting Number: ");
		int Number = Num.nextInt();
		System.out.print("Enter a  Ending Number: ");
		int Number2 = Num.nextInt();

	        while (Number < Number2) {
	            if(checkPrimeNumber(Number))
	                System.out.print(Number + " ");

	            ++Number;
	        }
	    }

	    public static boolean checkPrimeNumber(int num) {
	        boolean prime = true;

	        for(int i = 2; i <= num/2; ++i) {

	            if(num % i == 0) {
	                prime = false;
	                break;
	            }
	        }

	        return prime;
	    }
	

	}


