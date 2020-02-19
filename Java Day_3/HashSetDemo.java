package com.trainingdata;

import java .util.HashSet;
import java.util.Iterator;


public class HashSetDemo {
public static void main(String[] args) {
	HashSet<String> list = new HashSet<>();

	list.add("Hello");
	list.add("To");
	list.add("Java");
	list.add("Batch");
	list.add("Batch");
	list.add("Batch");
	list.add("Batch");
	list.add("Batch");
	list.add("Batch");
	list.add("7");
	list.add("true");

	
	Iterator<String> it= list.iterator();
	System.out.println("*****Forward Direction********");
	while(it.hasNext())
	{
		String element =it.next();
		System.out.println(element);
		
		
		}
	}
	
	
}
