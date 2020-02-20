package com.trainingdata;

public class AlphabeticalSort {

	public static void main(String[] args) {
		
		String NewString;
		 String Names[]= {"Neena", "Meeta", "Geeta", "Reeta", "Seeta"};
		 System.out.println("Unsorted String: ");
		 for(int i=0;i<Names.length;i++)
		 {
		 
		 System.out.print(Names[i]+" ");
		 }
		 System.out.println("");
		 
		 for (int i = 0; i < Names.length; i++) 
	        {
	            for (int j = i + 1; j < Names.length; j++) 
	            {
	                if (Names[i].compareTo(Names[j])>0) 
	                {
	                    NewString = Names[i];
	                    Names[i] = Names[j];
	                    Names[j] = NewString;
	                }
	            }
	        }
	        System.out.println("Sorted String:");
	        for (int i = 0; i < Names.length - 1; i++) 
	        {
	            System.out.print(Names[i] + ",");
	        }
	        System.out.print(Names[Names.length - 1]);

	   }

}


