package com.day10.training;

import java.util.ArrayList;
import java.util.Scanner;

public class StreamAPIArrayElemnts {

	public static void main(String[] args) {
	ArrayList<Integer> arr1= new ArrayList<>();	
	ArrayList<Integer> arr2= new ArrayList<>();
	ArrayList<Integer> arr= new ArrayList<>();
	arr.add(20);
	arr.add(40);
	arr.add(35);
	arr.add(80);
	arr.add(62);
	
	Divisible(arr,arr1);
	Double(arr1,arr2);
		
		
	}

	private static void Double(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		for(int i=0;i<arr1.size();i++)
		{
			arr2.add(arr1.get(i)*2);
		}
		System.out.println("Doubled Array is: "+arr2);
	}

	private static void Divisible(ArrayList<Integer> arr, ArrayList<Integer> arr1) {
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i)%2==0&&arr.get(i)%5==0)
			{
				arr1.add(arr.get(i));
			}
		}
		System.out.println("Array after Divisible is: "+arr1);
		
	}
	



}
