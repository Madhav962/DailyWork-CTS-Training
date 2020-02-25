package com.array.day9;

import java.util.Scanner;

public class TwoDArray {
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        System.out.print("Enter row Size:");
        int n = s.nextInt();
        System.out.print("Enter column Size:");
        int n1 = s.nextInt();
        int Arr[][]= new int[n][n1];
        System.out.println("Enter the Elements : ");
        for(int i = 0; i < n; i++)
        {
        	for(int j = 0; j < n1; j++)
        	{
        		 Arr[i][j] = s.nextInt();
        	}
           
        }
        RowSum(Arr); 
        ColumnSum(Arr);
        DiagonalSum(Arr);
        SumDivisibleElements(Arr);
     
	}
	
	
	private static void SumDivisibleElements(int[][] arr) {
		int i,j,sum = 0; 
		System.out.print( "Sum of the Elements divisible by 2&3 is: ");
		for (i = 0; i < arr.length; i++) 
	    { 
	        for (j = 0; j < arr.length; j++) 
	        { 
	        	if(arr[i][j]%2==0&&arr[i][j]%3==0)
	        	{
	        		sum+=arr[i][j];
	        	}
	        }
	    }
		 System.out.println(sum);
	}
	
	
	private static void DiagonalSum(int[][] Arr) {
		int i,j,sum = 0; 
		 System.out.print( "Sum of  Diagonal is: "); 
		 
		    for (i = 0; i < Arr.length; i++) 
		    { 
		        for (j = 0; j < Arr.length; j++) 
		        { 
		        	if(i==j)
		        	{
		   
		            sum = sum + Arr[i][j];
		        	}
		        }  
		    }
		    System.out.println(sum);
		
	}
	
	
	private static void ColumnSum(int[][] Arr) {
		 
		int i,j,sum = 0; 
		 
		 
		    for (i = 0; i < Arr.length; i++) 
		    { 
		        for (j = 0; j < Arr.length; j++) 
		        { 
		   
		            sum = sum + Arr[j][i]; 
		        } 
		 
		        System.out.println( "Sum of the Column "
		            + i + " = " + sum); 
		     
		        sum = 0; 
		    }
		
	}
	
	
	private static void RowSum(int Arr[][]) 
	{ 
	  
	    int i,j,sum = 0; 
	 
	 
	    for (i = 0; i < Arr.length; i++) 
	    { 
	        for (j = 0; j < Arr.length; j++) 
	        { 
	   
	            sum = sum + Arr[i][j]; 
	        } 
	 
	        System.out.println( "Sum of the row "
	            + i + " = " + sum); 
	     
	        sum = 0; 
	    } 
	} 

}
