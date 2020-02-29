package com.training.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {

	public static void main(String[] args) {
		
ZoneId zoneId=ZoneId.of("Asia/Calcutta");
		
		LocalDateTime localDateTime=LocalDateTime.now();
		ZonedDateTime zonedDateTime=ZonedDateTime.of(localDateTime, zoneId);
		System.out.println("Date and Time in delhi :"+zonedDateTime);

	}

}
