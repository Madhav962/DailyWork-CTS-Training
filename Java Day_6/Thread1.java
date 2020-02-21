package com.day6training;

public class Thread1 implements Runnable{
	Resource resource;
	public Thread1(Resource resource)
	{
		this.resource=resource;
	}
	@Override
	public void run()
	{
		resource.display("Thread-1");
	}
	

}
