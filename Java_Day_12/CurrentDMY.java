package com.training.date;

import java.time.LocalDate;

public class CurrentDMY {

	public static void main(String[] args) {
		
		LocalDate date1=LocalDate.now();
		int day=date1.getDayOfMonth();
		int month=date1.getMonthValue();
		int year=date1.getYear();
		System.out.printf("Year : %d , Month : %d , Day : %d \t %n",year,month,day);
		System.out.println();

	}

}
