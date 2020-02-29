package com.day13.training;

public class isEmptyMethod {
	public static void main(String[] args) {
		
	//  it will throw null pointer Exception..
	String password=null;
	if(password.isEmpty())
	{
		System.out.println("Password Should not be Empty");
	}
	else 
	{
		System.out.println("Go Ahead...");
	}

}
}
