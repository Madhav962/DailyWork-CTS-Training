package com.day6training;

public class PriorityOfThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);
		//		Here we have only one thread
		ThreadOne demo1= new ThreadOne(); // New Born state
		ThreadTwo demo2=new ThreadTwo();
		Runnable r1= new ThreadOne();
		Runnable r2= new ThreadTwo();
		Thread t1=new Thread(r1);
		Thread t2= new Thread(r2);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY+2);
		t1.start(); //READY sTATE
		t2.start();
		
		System.out.println("Mian Thread Priority: "+ Thread.currentThread().getPriority());
		System.out.println("Thread 1 priority: "+ t1.getPriority());
		System.out.println("Thread 2 Priority : "+t2.getPriority());
		

	}

}
