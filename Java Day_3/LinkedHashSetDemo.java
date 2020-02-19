package com.trainingdata;

import java .util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo {
public static void main(String[] args) {
	LinkedHashSet<String> list = new LinkedHashSet<>();

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

	while(it.hasNext())
	{
		String element =it.next();
		System.out.println(element);
		
		
		}
	}
	
	
}
