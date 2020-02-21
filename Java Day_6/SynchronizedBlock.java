package com.day6training;

public class SynchronizedBlock {
	public void display(String name) {
		synchronized (this) {
			
		for (int i=1;i<=5;i++)
		{
			System.out.println("Name Count: "+i+" -"+name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
}
