//8. Write a program in C to find the second largest element in an array.

package com.array.day9;

import java.util.Scanner;

public class SecondLargestElement {

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
        int temp = 0;
        for(int i = 0; i < n; i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		if(a[i]<a[j])
        		{
        		temp=a[j];
        		a[j]=a[i];
        		a[i]=temp;
        		}
        	}
        }
        System.out.print("Second Largest element in the Array is : "+a[1]);

	}

}
