//1. Write a program in C to read n number of values in an array and display it in reverse order

package com.array.day9;

import java.util.Scanner;

public class ArrayReverse {

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
		        System.out.print("Values stored into the Array are: ");
		        for(int i = 0; i < n; i++)
		        {
		        	System.out.print(a[i]+" ");
		        }
		        System.out.println();
		        System.out.print("Values stored into the Array in Reverse are: ");
		        
		        for(int i = n-1; i >=0; i--)
		        {
		        	System.out.print(a[i]+" ");
		        }

		}

}
