package com.day13.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add("one");
		set.add("Two");	
		set.add("Three");
		set.add("Four");
		set.add(2);// it will throw class cast exception
		System.out.println(set);
		
		
		

	}

}
