package com.training.date;

import java.time.Clock;

public class ClockDemo {

	public static void main(String[] args) {
		
		Clock clock=Clock.systemUTC();
		System.out.println("Clock :"+clock);
		
		Clock defaultClock=Clock.systemDefaultZone();
		System.out.println("Clock :"+defaultClock);


	}



}
