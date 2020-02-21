package com.day6training;

public class TableResource2 {
	public synchronized void display(String name) {
		for (int i=1;i<=10;i++)
		{
			System.out.println("Table of 4 :  "+"4*"+ i +"="+4*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
