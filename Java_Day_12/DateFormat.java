package com.training.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {

	public static void main(String[] args) {
		
String date="20200819";
		
		LocalDate formatted=LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.printf("The format of %s is %s \t%n",date,formatted);

	}

}
