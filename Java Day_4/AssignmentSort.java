package com.trainingdata;

import java.util.ArrayList;
import java.util.Collections;

public class AssignmentSort {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Neena");
		list.add("Meeta");
		list.add("Geeta");
		list.add("Reeta");
		list.add("Seeta");
		System.out.println("List Before Sorting: ");
		System.out.println(list);
		
		
		Collections.sort(list);
		System.out.println("List After Sorting: ");
		System.out.println(list);

	}

}
