package com.training.date;

import java.time.LocalDate;

public class EualityInDates {

	public static void main(String[] args) {
	
		LocalDate T=LocalDate.now();
		LocalDate BD=LocalDate.of(1996, 07, 15);
		
		if(BD.equals(T))
		{
			System.out.printf("Today %s and birthday %s are same dates %n",T,BD);
		}
		else
		{
			System.out.println("Dates are not Equal");
		}
      
        

	}

}
