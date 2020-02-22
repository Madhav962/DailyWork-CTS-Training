package com.day7;

public class RedLight extends TrafficSimulation implements Runnable{

	public void run() {
		
		for(int i=1;i<=20;i++)
		{
			if(status==1)
			{
			System.out.println("RedLight");
			
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			status=2;
		}
		
	}
	

}
