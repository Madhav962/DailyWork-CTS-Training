//4. Write a program in C to count a total number of duplicate elements in an array.

package com.array.day9;

import java.util.Scanner;

public class ArrayElementsDuplicate {

	public static void main(String[] args) {
		int count=0;
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
        	for(int j=i+1;j<n;j++)
        	{
        		if(a[i]==a[j])
        			count++;
        		break;
        	}
        }
        
        System.out.println("Total number of duplicate elements found in the array is :"+count);

	}

}
