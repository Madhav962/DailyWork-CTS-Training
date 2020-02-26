// Convert milliseconds to minutes and seconds individually

package com.day10.dailytask;

import java.util.concurrent.TimeUnit;

public class Milliseconds {

	public static void main(String[] args) {
		long milliseconds=1000000;
		long minutes= TimeUnit.MILLISECONDS.toMinutes(milliseconds);
		long seconds= TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		System.out.println("Entered Milliseconds is: "+milliseconds);
		System.out.println("Converted Milliseconds to Minutes are: "+minutes);
		System.out.println("Converted Milliseconds to Seconds are:"+seconds);
		

	}

}
