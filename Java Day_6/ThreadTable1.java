package com.day6training;

public class ThreadTable1 implements Runnable{
		
	    TableResources res;
		private TableResources TableResources;
		public ThreadTable1(TableResources res)
		{
			this.TableResources=res;
		}
		@Override
		public void run()
		{
			TableResources.display("Thread-1");
		}
		

}
