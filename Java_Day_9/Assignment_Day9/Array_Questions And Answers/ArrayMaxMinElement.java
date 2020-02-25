//5. Write a program in C to find the maximum and minimum element in an array. 

package com.array.day9;

import java.util.Scanner;

public class ArrayMaxMinElement {

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
        		if(a[i]>a[j])
        		{
        		temp=a[i];
        		a[i]=a[j];
        		a[j]=temp;
        		}
        		
        	}
        }
System.out.print("Maximum element is : "+a[n-1] );
System.out.println();
System.out.print("Minimum element is: "+a[0]);

	}

}
