package com.trainingdata;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
    	int Number = input.nextInt();
    	boolean prime= false;
    	for(int i=2;i<=Number-1;i++)
    	{
    		if(Number%i==0)
    		{
        		prime=true;
        		break;	
    		}

    	}
    	if(!prime)
    	{
    		System.out.println(Number +" is a Prime Number");
    	}
    	else
    	{
    		System.out.println(Number+ " is Not a Prime Number");
    	}

	}

}
