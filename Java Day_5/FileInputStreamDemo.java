package com.file.input.output;

import java.io.File;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		
		String path="C:\\Users\\admin\\Desktop\\Book.txt";
		File file= new File(path);
		System.out.println("File Name: "+file.getName());
		System.out.println("File Length : "+ file.length());
		System.out.println("File Parent : "+file.getParent());
		System.out.println("File Path : "+file.getPath());
		System.out.println("File hidden"+file.isHidden());
		

	}

}
