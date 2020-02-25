package com.day8dailytask;

import java.util.Scanner;

public class WhiteSpaces {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter The String:");
		  String  S = sc.nextLine();
		        
		        System.out.println("Original sentence: " + S);

		        S = S.replaceAll("\\s", "");
		        System.out.println("After replacement: " + S);
		    }
		

}


