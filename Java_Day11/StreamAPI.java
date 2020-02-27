package com.training.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		ArrayList<String> Names= new ArrayList<>();
		addNames(Names);
		//1. Print names more than length 6
		List<String> NameList=Names.stream().filter(s->s.length()>6).collect(Collectors.toList());
		System.out.println("*************Names with Length Greater Than 6**************");
		NameList.forEach(System.out::println);
		
		//2. Names in UpperCase
		
		List<String> namesInUpper = Names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("*********Names in Upper Case***************");
		namesInUpper.forEach(System.out::println);
		
		long count = Names.stream().count();
		System.out.println("List Count is: "+count);
		Stream<Integer> data= Stream.of(1,11,111,1111,11111);
		System.out.println("Data Count: "+data.count());
		
		//3. sort the list
		List<String> sorted=Names.stream().sorted().collect(Collectors.toList());
		System.out.println("****Default Sorting****");
		sorted.forEach(System.out::println);
		
		//4. custom Sorting
		List<String> customsorting=Names.stream().sorted((s1,s2)-> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("****Default Sorting****");
		customsorting.forEach(System.out::println);
		
		Stream<String> languages= Stream.of("C","C++","Java","Python","Angular");
//		List<String> lanlength= languages.filter(s->s.length()>4).collect(Collectors.toList());
//		System.out.println("**********Languages Whose Length is more than 4 are*************");
//		lanlength.forEach(System.out::println);
		
		List<String> lanConcatenate = languages.map(s-> s+s.concat(" Programming")).collect(Collectors.toList());
		System.out.println("*************Concatenated Stream is:*****************");
		lanConcatenate.forEach(System.out::println);
		
		
		

	}

	private static void addNames(ArrayList<String> names) {
		names.add("Neeraj");
		names.add("Pulkit");
		names.add("Naveen");
		names.add("Mayuresh");
		names.add("Bharat");
		
	}
	

}
