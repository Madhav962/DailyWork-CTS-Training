package com.trainingdata;

public class AverageUsingArray {
	public static void main(String args[]) {
		
		int[] Array = { 4, 6, 5, 2, 3, 4 };
        int sum = 0;

        for (int num: Array) {
           sum += num;
        }

        int average = sum / Array.length;
        System.out.println("The average is: "+ average);
    }
		
	}


