package com.day10.dailytask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<String> list1= new ArrayList<String>();
		list1.add("W");
		list1.add("o");
		list1.add("W");
		String Array[]= new String[list1.size()];
		list1.toArray(Array);
		System.out.println("Converted Array is: "+Arrays.toString(Array));
		

	}

}
