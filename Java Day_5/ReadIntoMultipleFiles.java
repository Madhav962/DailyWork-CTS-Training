package com.file.input.output;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ReadIntoMultipleFiles {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		String path1="C:\\Users\\admin\\Desktop\\cse.txt";
		String path2="C:\\Users\\admin\\Desktop\\GetSet.java";
//		String path3="C:\\Users\\admin\\Desktop\\ec.txt";
//		String path4="C:\\Users\\admin\\Desktop\\me.txt";
		
		FileInputStream fin1= new FileInputStream(path1);
		FileInputStream fin2= new FileInputStream(path2);
		
		SequenceInputStream sis= new SequenceInputStream(fin1, fin2);
		
		int i;
		 while((i=sis.read())!=-1)
	        {
	        	System.out.print((char)i);

	        }
		

	}

}
