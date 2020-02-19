package com.trainingdata;
import java.util.Arrays;
import java.util.Scanner;

public class SortingString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str= s. nextLine();
		char arr[]= str.toCharArray();
		Arrays.sort(arr);
		 System.out.print(String.valueOf(arr));

	}

}
