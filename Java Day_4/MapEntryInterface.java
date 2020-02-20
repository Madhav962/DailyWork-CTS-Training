package com.trainingdata;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapEntryInterface {

	public static void main(String args[])
	{
		HashMap<String, Integer> map= new HashMap<>();
		map.put("Banana", 35);
		map.put("Orange", 60);
		map.put("Mangoe", 110);
		map.put("Grapes", 200);
		map.put("Water Melon", 20);
		map.put("Banana", 70);

		for(Entry<String, Integer> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+"......>"+entry.getValue());
		}
		
}
}
