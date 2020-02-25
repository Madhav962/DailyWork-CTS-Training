//6. Write a program in C to separate odd and even integers in separate arrays.

package com.array.day9;

import java.util.Scanner;

public class ArrayOddEven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Enter array Size:");
        int n = s.nextInt();
        int a[] = new int[n];
        int Even[] = new int[n];
        int Odd[] =new int[n] ;
        System.out.println("Enter  the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        int k=0,j=0;
        for(int i = 0; i < n; i++)
        {
        	if(a[i]%2==0)
        	{
        		Even[k]=a[i];
        		k++;
        	}
        	else
        	{
        		Odd[j]=a[i];
        		j++;
        	}
        }
        
     System.out.print("The Even elements are :");
     for(int i = 0; i < k; i++)
     {
    	 System.out.print(Even[i]+" ");
     }
     System.out.println();
     System.out.print("The odd Elements are: ");
     for(int i = 0; i < j; i++)
     {
    	 System.out.print(Odd[i]+" ");
     }

	}

}
