//Program to Convert Map (HashMap) to List

package com.dailytask.day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {

	public static void main(String[] args) {
		
		Map<Integer,String> map= new HashMap<>();
		map.put(1,"w");
		map.put(2, "O");
		map.put(3, "w");
		
        List <Integer> list = new ArrayList(map.keySet());
        List<String> list2 = new ArrayList(map.values());
        System.out.println("New Integer List Is: "+list);
        System.out.println("New String list is: "+list2);
        
		
	}

}
