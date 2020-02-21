package com.day6dailytask;

import java.util.Scanner;

public class LargestElementOfArray {

	public static void main(String[] args) {
		   
		   int size;
	       Scanner scan = new Scanner(System.in);
		   
	       System.out.print("Enter Array Size : ");
	       size = scan.nextInt();
	       int arr[]=new int[size];
		   
	       System.out.print("Enter Array Elements : ");
	       for(int i=0; i<size; i++)
	       {
	           arr[i] = scan.nextInt();
	       }
		   int Largest=arr[0];
	       for (int num: arr) {
	            if(Largest < num)
	                Largest = num;
	        }

	        System.out.println("Largest element is: "+ Largest);
	    }
	

	}


