package com.training.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class BetweenDays {

	public static void main(String[] args) {
LocalDate myMarriage=LocalDate.of(2016, Month.FEBRUARY, 03);
		
		LocalDate today=LocalDate.now();
		
		Period months=Period.between(myMarriage, today);
		System.out.println("Months between My Marriage and today :"+months.getMonths());

	}

}
