package com.day7;

public class YellowLight extends TrafficSimulation implements Runnable {


	public void run() {
		for(int i=1;i<=20;i++)
		{
			if(status==3)
			{
			System.out.println("YellowLight");
		
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			status=1;
		}
		
	}

}
