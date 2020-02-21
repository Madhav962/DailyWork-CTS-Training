package com.day6training;

public class TennisThread {

	public static void main(String[] args) {

		Player1 demo1= new Player1(); // New Born state
		Player2 demo2=new Player2();
		Runnable r1= new Player1();
		Runnable r2= new Player2();
		Thread t1=new Thread(r1);
		Thread t2= new Thread(r2);
		t1.start(); //READY sTATE
		t2.start();

		
	
	for(int i=1;i<2;i++)
	{
		System.out.println("Player1 ready...");
		System.out.println("Player2 ready...");
	}

}
}
