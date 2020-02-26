//Check if Int Array contains a given value

package com.trainingdata;

import java.util.Scanner;

public class FindingElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n= sc.nextInt();
		int A[]=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be found: ");
		int E= sc.nextInt();
		boolean found=false;
		for(int i=0;i<n;i++)
		{
			if(A[i]==E)
			{
				found=true;
				System.out.print("The Entered element is found and is at index: "+i);
				break;
			}
			
		}
		if(found==false)
		{
			System.out.println("The given element is Not found");
		}

	}

}
