package com.trainingdata;

public class StandardDeviation {

	public static void main(String[] args) {
		
		double[] Array = { 4, 6, 5 };
        double sum = 0;

        for (double num: Array) {
           sum += num;
        }

        double average = sum / Array.length;
//        System.out.println("The average is: "+ average);
        double Variance=0;
        double n1= average-Array[0];
        double n2= average-Array[1];
        double n3= average-Array[2];
        
        Variance= n1*n1+n2*n2+n3*n3/5;
        double StandardDeviation= Math.sqrt(Variance);
        System.out.println("The StandardDeviation is: "+ StandardDeviation);
        
    }

	

}
