package com.day7;


public class TrafficSimulation {
int status=1;
	public static void main(String[] args) {
	
		
		RedLight demo1= new RedLight(); // New Born state
		GreenLight demo2=new GreenLight();
		YellowLight demo3 =new YellowLight();
		RedLight r1= new RedLight();
		Runnable r2=  new GreenLight();
		Runnable r3= new YellowLight();
		Thread t1=new Thread(r1);
		Thread t2= new Thread(r2);
		Thread t3=new Thread(r3);
		t1.start(); //READY sTATE
		t2.start();
		t3.start();

		
	
	
		System.out.println("Traffic Light Simulation...");
	
	
	}

}
