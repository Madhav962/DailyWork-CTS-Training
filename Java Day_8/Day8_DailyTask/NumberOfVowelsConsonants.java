//Java Program to Count the Number of Vowels and Consonants in a Sentence

package com.day8dailytask;

import java.util.Scanner;

public class NumberOfVowelsConsonants {

	public static void main(String[] args) {
		
		String Sentence;
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Sentence:");
		  String  S = sc.nextLine();
		  int vowel=0,consonant=0;
		  String NS=S.toLowerCase();
		  for(int i = 0; i < NS.length(); ++i)
	        {
	            char ch = NS.charAt(i);
	            if(ch == 'a' || ch == 'e' || ch == 'i'
	                || ch == 'o' || ch == 'u') {
	                ++vowel;
	            }
	            else if((ch >= 'a'&& ch <= 'z')) {
	                ++consonant;
	            }
	            
	            
	        }
		  System.out.println("Number of vowels are:"+vowel);
		  System.out.println("Number of consonants are: "+consonant);
	}

}
