//Java Program to Find Transpose

package com.trainingdata;

public class TransposeMatrix {

	public static void main(String[] args) {
	     
		    int rows = 3, columns = 3;
	        int[][] Matrix = { {5, 3, 6}, {3, 2, 3},{7,8,5} };
	       
	        int[][] TransposeMatrix= new int [rows][columns];
	        
	        for(int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                TransposeMatrix[j][i] = Matrix[i][j];
	            }
	        }
	        System.out.println("The TransposeMatrix is: ");
		     
        	for(int j=0;j<3;j++)
        	{
        		System.out.print(TransposeMatrix[0][j]+" ");
        		
        	}
        	System.out.println();
        	for(int j=0;j<3;j++)
        	{
        		System.out.print(TransposeMatrix[1][j]+" ");
        		
        	}
        	System.out.println();
        	for(int j=0;j<3;j++)
        	{
        		System.out.print(TransposeMatrix[2][j]+" ");
        		
        	}
        	System.out.println();

	}

}
