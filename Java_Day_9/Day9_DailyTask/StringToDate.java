//Convert String to Date using predefined formatters

package com.array.day9_dailytask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringToDate {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Date: ");
		String date= sc.nextLine();
		 LocalDate D = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
		System.out.println("Entered Date is: "+D);

	}

}
