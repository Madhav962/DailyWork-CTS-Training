//7. Write a program in C to sort elements of array in ascending order.

package com.array.day9;

import java.util.Scanner;

public class SortingArray {

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
        System.out.print("Array sorted in Ascending order is: ");
        for(int i = n-1; i >=0; i--)
        {
        	System.out.print(a[i]+" ");
        }
        }
	

}
