package com.day6training;

public class ThreadResourceSuper {
	public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
//	Here we have only one thread
	Resource res= new Resource();
	Thread1 demo1= new Thread1(res); // New Born state
	Thread2 demo2=new Thread2(res);

	Thread t1=new Thread(demo1);
	Thread t2= new Thread(demo2);
	 
	t1.start(); //READY sTATE
    t2.start();


}
}
