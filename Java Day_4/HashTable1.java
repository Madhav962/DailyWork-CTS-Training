package com.trainingdata;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		
		Hashtable<String, String> map= new Hashtable<>();
		map.put("Banana", "35");
		map.put("Orange", "60");
		map.put("Mangoe", "110");
		map.put("Grapes", "200");
		map.put("Water Melon", "20");
		map.put("Banana", "70");
//		map.put(null, 0);
		map.put("water", null);

		for(Entry<String, String> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+"......>"+entry.getValue());
		}

	}

}
// Will Produce Error For Providing Null Values Both In Key And Value.
