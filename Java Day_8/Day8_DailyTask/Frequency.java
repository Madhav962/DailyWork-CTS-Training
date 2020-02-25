//Java Program to Find the Frequency of Character in a String
package com.day8dailytask;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		String Sentence;
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Sentence:");
		  String  S = sc.nextLine();
		  int frequency=0;
          char C='a';
		  for(int i = 0; i < S.length(); i++) {
	            if(C == S.charAt(i)) {
	            	frequency++;
	            }
	}
		  
System.out.println("The Frequency is: "+frequency);
	}
}
