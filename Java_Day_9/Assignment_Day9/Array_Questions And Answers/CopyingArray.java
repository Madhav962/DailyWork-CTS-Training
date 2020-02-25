// Write a program in C to copy the elements of one array into another array.

package com.array.day9;

import java.util.Scanner;

public class CopyingArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        System.out.print("Enter array Size:");
        int n = s.nextInt();
        int a[] = new int[n];
        int a2[]=new int[n];
        System.out.println("Enter  the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
        	for(int j=0;j<n;j++)
        		
        	a2[i]=a[i];
        }
        System.out.println("Elements stored in the first array is: ");
        for(int i = 0; i < n; i++)
        {
        	System.out.print(a[i]+" ");
        }
        System.out.println("Elements stored in the Second array is: ");
        for(int i = 0; i < n; i++)
        {
        	System.out.print(a2[i]+" ");
        }
	}

}
