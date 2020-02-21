package com.day6training;

public class TennisResource {

	public static void main(String[] args) {
		public void display(String string) {
			// TODO Auto-generated method stub
			for (int i=1;i<=10;i++)
			{
				System.out.println("Ping->");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

		public void display2(String string) {
			// TODO Auto-generated method stub
			for (int i=1;i<=10;i++)
			{
				System.out.println("Pong->");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
}



