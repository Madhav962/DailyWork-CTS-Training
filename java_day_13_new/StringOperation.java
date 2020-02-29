package com.day13.training;

public class StringOperation {

	public static void main(String[] args) {
		String str1= "java";
		String str2= new String ("java");
		String str3="java";
		String str4= new String ("java");
		if(str1.equals(str2))
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not equals");
		}
	}
}
