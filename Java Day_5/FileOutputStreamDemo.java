package com.file.input.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamDemo {
	public static void main(String...args) throws FileNotFoundException,IOException{
		
		String path="C:\\Users\\admin\\Desktop\\Data.txt";
		FileOutputStream out = new FileOutputStream(path,true);
		
		String message= " The Joining Date was 28th Janauary 2020";
		byte b[] = message.getBytes();
		out.write(b);
		out.close();
		
	}

}
