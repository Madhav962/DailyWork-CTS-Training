package com.book;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) throws NoSuchElementException,FileNotFoundException,IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\admin\\Desktop\\BookData.txt"));
		Scanner src = new Scanner(System.in);
        int choice;
    	do {
    		System.out.println("*************** Welome to Book Portal***************");
    		System.out.println("Press 1 for Input Option.\nPress 2 for Display Option\nPress 3 to Exit.\n\n");
    		System.out.println("Enter your choice: ");
    		choice = src.nextInt();
	
    	switch (choice) {
    	case 1:
    		
    		System.out.print("Enter  BookNmae: ");
    		String bookName = reader.readLine();
    		System.out.print("Enter  BookAuthor: ");
    		String bookAuthor = reader.readLine();
    		System.out.print("Enter  BookPrice: ");
    		String bookPrice= reader.readLine();
    		
    		
    		writer.write(bookName+"\t"+bookAuthor+"\t"+bookPrice+"\n");
    
    		writer.flush();
    		
    		break;
    	case 2:
    		String path="C:\\Users\\admin\\Desktop\\BookData.txt";
    		File file= new File(path);
            FileInputStream in =new FileInputStream(file);
            int i;
            while((i=in.read())!=-1)
            {
            	System.out.print((char)i);

            }
            break;
            
    	case 3:
    		System.exit(0);
    		
    	default:
			System.out.println("Invalid choice! Please try again!\n");
			choice = src.nextInt();
		}
	} while (choice != 3);
    	
    	
    	writer.close();
    	reader.close();
    	}

}
