package com.trainingdata;


import java.util.HashSet;
import java .util.TreeSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class TreeSetDemo {
public static void main(String[] args) {
	TreeSet<String> list = new TreeSet<>();

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
