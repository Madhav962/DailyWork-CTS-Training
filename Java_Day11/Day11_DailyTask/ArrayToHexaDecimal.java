package com.dailytask.day11;

import java.util.Scanner;

public class ArrayToHexaDecimal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n= sc.nextInt();
		byte bytes[]=  new byte [n];
		System.out.println("Enter the elements of Array: ");
		for(int i=0;i<n;i++)
		{
			bytes[i]=sc.nextByte();
		}
		
		 for (byte b : bytes) {
	            String st = String.format("%02X", b);
	            System.out.print(st);
	        }

	}

}
