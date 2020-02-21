package com.day6training;

public class ThreadTable2 implements Runnable{
	
		TableResource2 resource;
		public ThreadTable2(TableResource2 res2)
		{
			this.resource=res2;
		}
		@Override
		public void run()
		{
			resource.display("Thread-2");
		}
		

}

