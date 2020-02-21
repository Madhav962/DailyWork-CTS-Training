package com.day6training;

public class TableResources {
	public synchronized void display(String name) {
		for (int i=1;i<=10;i++)
		{
			System.out.println("Table of 2 :  "+"2*"+ i +"="+2*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}


