package com.day6training;

public class Player2 implements Runnable{
	
	@Override
	public void run()
	
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			System.out.println("Ping->");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}


}
