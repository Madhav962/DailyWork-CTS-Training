package com.wordacceptance;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SearchData {
	
	public static void SearchText(String name) throws FileNotFoundException, IOException {
		int count = 0;
		String st; 
		
		File file = new File("C:\\Users\\admin\\Desktop\\Data1.txt");
		FileReader fd = new FileReader(file);
		BufferedReader out = new BufferedReader(fd);
		
		
		while ((st = out.readLine()) != null) {
			String[] words = st.split(" ");
			for (String word : words) {
				if (word.equals(name)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\admin\\Desktop\\Data1.txt";
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bin = new BufferedReader(reader);
		System.out.println("Enter Text = ");
		String s = bin.readLine();
		SearchText(s);
	}


}


