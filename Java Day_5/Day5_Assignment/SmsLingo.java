package com.day6training;

import java.util.Scanner;

public class SmsLingo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String:  ");
    	String st = s.nextLine();
    	if(st.length()>=200)
    	{
    		System.out.println("Please Remeber The length of Message cannot Be more than 200");
    		
    	}
    	if(st!=st.toLowerCase())
    	{
    		System.out.println("Please enter The Message in Lower-case Letters");
    	}
    	
    	String St2= Modification(st);
    	System.out.println("Modified String is: " + St2);
	}

	public static String Modification(String st) {
		
		st=st.replaceAll("yes","s");
		st=st.replaceAll("you","u");
		st=st.replaceAll("why","y");
		st=st.replaceAll("today","2day");
		System.out.println(st);
		
		return st;
		
	}

}
