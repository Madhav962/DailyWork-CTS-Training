//Join Two Lists using addAll()

package com.day10.dailytask;

import java.util.ArrayList;
import java.util.List;

public class ListJoin {
	
public static void main(String args[])
{
	List<String> list1= new ArrayList<String>();
	list1.add("W");
	list1.add("o");
	list1.add("W");
	List<String> list2= new ArrayList<String>();
	list2.add("G");
	list2.add("o");
	list2.add("o");
	list2.add("D");
	List<String> JoinedList= new ArrayList<String>();
	JoinedList.addAll(list1);
	JoinedList.addAll(list2);
	System.out.println("List1 is: "+list1);
	System.out.println("List2 is: "+list2);
	System.out.println("Joined List is: "+JoinedList);
	
	
}
}
