//Program to Multiply Two Matrices using a Function

package com.trainingdata;

public class FunctionMulMatrix {

	public static void main(String[] args) {
		
		
	     int r1 = 2, c1 = 3,r2=3,c2=2;
	        int[][] FirstMatrix = { {5, 3, 6}, {3, 2, 3} };
	        int[][] SecondMatrix = { {8, 6}, {5, 6},{4,5} };
	        int[][] NewMatrix= MultipliedMatrix(FirstMatrix, SecondMatrix, r1, c1, c2);
	        
	        System.out.println("The NewMatrix is: ");
		     
        	for(int j=0;j<2;j++)
        	{
        		System.out.print(NewMatrix[0][j]+" ");
        		
        	}
        	System.out.println();
        	for(int j=0;j<2;j++)
        	{
        		System.out.print(NewMatrix[1][j]+" ");
        		
        	}

	}



	private static int[][] MultipliedMatrix(int[][] FirstMatrix, int[][] SecondMatrix, int r1, int c1, int c2) {
		int[][] Product = new int[r1][c2];
        for( int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    Product[i][j] += FirstMatrix[i][k] * SecondMatrix[k][j];
                }
            }
        }
		return Product;
	}



}
