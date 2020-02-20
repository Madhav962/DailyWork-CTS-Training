package com.trainingdata;
import java.util.HashMap;

public class MapDemo {
	
public static void main(String args[])
{
	HashMap<String, Integer> map= new HashMap<>();
	map.put("Banana", 35);
	map.put("Orange", 60);
	map.put("Mangoe", 110);
	map.put("Grapes", 200);
	map.put("Water Melon", 20);
	map.put("Banana", 70);
	
	map.remove("Water Melon");
	map.clone();
	map.clear();
	
	System.out.println(map.get("Grapes"));
	System.out.println(map.containsKey("Banana"));
	System.out.println(map);
	
	
}
}
