package com.day6training;

public class MainThread {
public static void main(String args[]) {
	
	Thread t= Thread.currentThread();
	System.out.println(t);
	System.out.println(t.getName());
	t.setName("Thread-1");
	System.out.println(t);
	System.out.println(t.getPriority());
	System.out.println("Is This daemon"+t.isDaemon());
	System.out.println("Is this alive"+t.isAlive());
}
}
