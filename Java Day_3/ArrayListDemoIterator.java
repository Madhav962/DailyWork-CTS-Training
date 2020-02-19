package com.trainingdata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemoIterator {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
//	List = new ArrayList();
	list.add("Hello");
	list.add("To");
	list.add("Java");
	list.add("Batch");
	list.add("7");
	list.add("true");
	
	ListIterator<String> it= list.listIterator();
	System.out.println("*****Forward Direction********");
	while(it.hasNext())
	{
		String element =it.next();
		System.out.println(element);
	}
	
	System.out.println("*****Backward Direction********");
	while(it.hasPrevious())
	{
		String element =it.previous();
		System.out.println(element);
	}
}
}
