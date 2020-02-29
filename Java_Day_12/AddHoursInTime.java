package com.training.date;

import java.time.LocalTime;

public class AddHoursInTime {

	public static void main(String[] args) {
		
        LocalTime current=LocalTime.now();
		LocalTime newTime=current.plusHours(4);
		System.out.println("New  time is :"+newTime);

	}

}
