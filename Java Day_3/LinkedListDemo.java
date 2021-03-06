package com.trainingdata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java .util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<>();
//	List = new ArrayList();
	list.add("Hello");
	list.add("To");
	list.add("Java");
	list.add("Batch");
	list.add("7");
	list.add("true");
	list.addFirst("Start");
	list.addLast("End");
	
	ListIterator<String> it= list.listIterator();
	System.out.println("*****Forward Direction********");
	while(it.hasNext())
	{
		String element =it.next();
		System.out.println(element);
		
		if(element.contentEquals("Java")) {
			break;
		
		}
	}
	
	System.out.println("*****Backward Direction********");
	while(it.hasPrevious())
	{
		String element =it.previous();
		System.out.println(element);
	}
	System.out.println("The Object at Index 2 is : "+ list.get(2));
}
}
