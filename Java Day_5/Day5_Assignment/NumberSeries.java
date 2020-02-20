//Generate a series of first 10 number as follows
//   36,34,30,28,24,22,18,16,12,10



package com.assignment;

import java.util.Scanner;

public class NumberSeries {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
    	int Number = input.nextInt();
    	int n=Number;
        
    	for(int i=0;i<9;i++)
    	{
    		if(i%2==0)
    		{
    			System.out.println(n-=2);
    			
    			
    		}
    		else if(i%2==1)
    		{
    			System.out.println(n-=4);
    			
    		}
    		
    	}
        
	}

	}

