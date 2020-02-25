package com.day8dailytask;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        System.out.print("Enter array Size:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter  the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
        	System.out.println("Array is: "+a[i]);
        }

	}

}
