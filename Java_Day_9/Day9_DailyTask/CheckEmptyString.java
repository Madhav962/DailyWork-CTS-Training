package com.trainingdata;

import java.util.Scanner;

public class CheckEmptyString {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String S= sc.nextLine();
		if(isNullOrEmpty(S))
		{
			System.out.println("Please enter an Non-empty String");
		}
		else 
		{
			System.out.println("The String is OK");
		}

	}

	public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    
	}
}
