package com.training.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateAfter1Week {

	public static void main(String[] args) {

		LocalDate today=LocalDate.now();
		LocalDate next=today.plus(2, ChronoUnit.WEEKS);
		System.out.println("Today's date is :"+today);
		System.out.println("2 week Later date is :"+next);

	}

}
