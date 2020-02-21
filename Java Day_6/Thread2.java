package com.day6training;

public class Thread2 implements Runnable {

		Resource resource;
		public Thread2(Resource resource)
		{
			this.resource=resource;
		}
		@Override
		public void run()
		{
			resource.display("Thread-1");
		}
		

}


