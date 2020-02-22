package com.day7;

public class GreenLight extends TrafficSimulation implements Runnable{


	public void run() {
		for(int i=1;i<=20;i++)
		{
			if(status==2)
			{
			System.out.println("GreenLight");
			
		}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			status=3;
		}
		
	}

}
