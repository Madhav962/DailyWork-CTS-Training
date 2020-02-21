package com.day6training;

public class ThreadLifeCycle {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
//		Here we have only one thread
		ThreadOne demo1= new ThreadOne(); // New Born state
		ThreadTwo demo2=new ThreadTwo();
		Runnable r1= new ThreadOne();
		Runnable r2= new ThreadTwo();
		Thread t1=new Thread(r1);
		Thread t2= new Thread(r2);
		 t1.start(); //READY sTATE
		 t2.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}

	}

}