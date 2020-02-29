package com.day13.training;

import java.io.FileReader;
import java.io.IOException;

public class exceptionhandling {
	public void readData()throws IOException
	{
		FileReader fr= new FileReader("empData.txt");
		int i= fr.read();
		System.out.println("Hi"+i);
	}
	public void task2() throws IOException
	{
		readData();
		
	}
	
	public static void main(String[] args) throws Exception {
		exceptionhandling e= new exceptionhandling();
			e.task2();
	
		System.out.println("end of file");  // here end of file will not be printed this means it cannot handle exception
	}
	
	
	//Only way to hande exception is trycatch doesnot believe try throws AS UPPER
	
//	public static void main(String[] args) {
//		exceptionhandling e= new exceptionhandling();
//		try {
//			e.task2();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		System.out.println("end of file");
//	}

}
