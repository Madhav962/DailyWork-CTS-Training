package com.trainingdata;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.Map.Entry;;
public class TreeMap1 {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> map= new TreeMap<>();
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
