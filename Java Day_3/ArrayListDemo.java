package com.trainingdata;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
//	List = new ArrayList();
	list.add("Hello");
	list.add("To");
	list.add("Java");
	list.add("Batch");
	list.add("7");
	list.add("true");
	System.out.println(list);
	list.remove(2);
	list.add(2,"Advanced Java");
	System.out.println("List contains Python ? : " +list.contains("python"));
	
	
	for(String obj: list)
	{
		System.out.println(obj);
		if(obj.equals("Java"))
				{
			break;
		}
	}
}
}
