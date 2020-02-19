package com.trainingdata;

import java .util.TreeSet;
import java.util.Iterator;


public class SelectionSort {
public static void main(String[] args) {
	TreeSet<String> list = new TreeSet<>();

	list.add("Neena");
	list.add("Meeta");
	list.add("Geeta");
	list.add("Reeta");
	list.add("Seeta");

	
	Iterator<String> it= list.iterator();

	while(it.hasNext())
	{
		String element =it.next();
		System.out.println(element);
		
	
		}
	}
	
	
}
