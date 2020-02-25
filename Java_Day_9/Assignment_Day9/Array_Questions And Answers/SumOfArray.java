//2. Write a program in C to find the sum of all elements of the array.

package com.array.day9;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		int sum=0;
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
        	sum+=a[i];
        }
        System.out.println("Sum of all the elements stored in the array is: "+sum);
	}

}
