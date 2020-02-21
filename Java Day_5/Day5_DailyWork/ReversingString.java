package com.trainingdata;

import java.util.Scanner;

public class ReversingString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		 String Reversed = reverse(s);
	     System.out.println("The reversed String is: " + Reversed);
	     
	    }

	    public static String reverse(String st)
	    {
	        if (st.isEmpty())
	            return st;

	        return reverse(st.substring(1)) + st.charAt(0);
	    }

	}


