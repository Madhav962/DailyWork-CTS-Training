package com.training.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		
		LocalDate ld= LocalDate.now();
		LocalTime lt= LocalTime.now();
		LocalDateTime ldt= LocalDateTime.now();
		System.out.println(ld);
		System.out.println();
		System.out.println(lt);
		System.out.println();
		System.out.println(ldt);
		
	}
		
//		Date date = new Date();
////		OR
////		Date date = new Date(0);
//    	System.out.println(date);
//		int day=date.getDay();
//		
//		switch(day)
//		{
//		case 0: System.out.println("Sunday");
//		break;
//		case 1: System.out.println("Monday");
//		break;
//		case 2: System.out.println("Tuesday");
//		break;
//		case 3: System.out.println("Wednesday");
//		break;
//		case 4: System.out.println("Thursday");
//		break;
//		case 5: System.out.println("Friday");
//		break;
//		case 6: System.out.println("Saturday");
//		break;
//		default:
//			System.out.println("Wrong choice");
//		}
//
//	}

}//
