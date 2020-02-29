package com.day13.training;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<>();
		map.put(23456, "rahul$$");
		map.put(56576, "kartik@ks");
		map.put(874378, "bumrah@2");
	
		
		Set entrySet= map.entrySet();
		
		Iterator it= entrySet.iterator();
		System.out.println("The given HashMap is: ");
		System.out.println();
		
		while(it.hasNext())
		{
			Map.Entry me= (Map.Entry)it.next();
			System.out.println("key is: "+me.getKey()+" & "+"Value is= "+me.getValue());
		}

	}

}
