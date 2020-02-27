//Convert Array to Set

package com.dailytask.day11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayToSet {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n= sc.nextInt();
		String arr[]=  new String [n];
		System.out.println("Enter the elements of Array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		
		
		Set<String> s= new HashSet<>(Arrays.asList(arr));
		System.out.println("New Set is: "+s);
		
	}

}
