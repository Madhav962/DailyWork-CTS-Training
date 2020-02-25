//Program to Add Two Matrices

package com.trainingdata;

public class AddMatrix {

	public static void main(String[] args) {
		
	     int rows = 3, columns = 3;
	        int[][] FirstMatrix = { {5, 3, 6}, {3, 2, 3},{7,8,5} };
	        int[][] SecondMatrix = { {8, 6, 3}, {5, 6, 8},{4,5,6} };
	        int[][] NewMatrix= new int [rows][columns];
	        int i,j;
	        for(i=0;i<3;i++)
	        {
	        	for(j=0;j<3;j++)
	        	{
	        		NewMatrix[i][j]=FirstMatrix[i][j]+SecondMatrix[i][j];
	        		
	        	}
	        }
	        System.out.println("The NewMatrix is: ");
	     
	        	for(j=0;j<3;j++)
	        	{
	        		System.out.print(NewMatrix[0][j]+" ");
	        		
	        	}
	        	System.out.println();
	        	for(j=0;j<3;j++)
	        	{
	        		System.out.print(NewMatrix[1][j]+" ");
	        		
	        	}
	        	System.out.println();
	        	for(j=0;j<3;j++)
	        	{
	        		System.out.print(NewMatrix[2][j]+" ");
	        		
	        	}
	        
	}

}
