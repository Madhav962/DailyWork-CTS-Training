// String[] input={"100","111","10100","10","1111"}
//   input2="10"   
//   output=2;
//   count strings having prefix "10" but "10" not included in count.
   
   
package com.assignment;

import java.util.Scanner;

public class CheckStringPrefix {

	public static void main(String[] args) {
		
	        String S[]= {"100","111","10100","10","1111"};
	
			String num;
			Scanner sc = new Scanner(System.in);		
			System.out.println(" Enter Prefix string for search");
			num =sc.next();
			int len=S.length;
			System.out.println(len);
			int count=0;
			String num1;
			
			for( int j=0 ; j<len ;j++)
			{
				num1=S[j];
				if(num1.startsWith(num)&& !num1.equals(num))
				{
					count ++;
			
				}
			System.out.println("Searched digit = " +count);
			}
	}
}

