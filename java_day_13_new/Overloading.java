package com.day13.training;


public class Overloading {
	public void add(int a, int b)
	{
		System.out.println("Hi");
	}
	public void add(double c,double d)
	{
		System.out.println("Hello");
	}
	public void add(float e,float f)
	{
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.add(2.1f,3.3f);

	}

}
