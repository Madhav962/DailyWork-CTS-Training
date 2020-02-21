package com.day6training;

public class Player1 implements Runnable{

		@Override
		public void run() {
			
	for(int i=1;i<=20;i++)
	{
		if(i%2==0)
		System.out.println("<-Pong");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
		}
		
	}

