package com.file.input.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo2{

	public static void main(String args[])  throws FileNotFoundException,IOException {
		
		String path="C:\\Users\\admin\\Desktop\\Data.txt";
		File file= new File(path);
        FileInputStream in =new FileInputStream(file);
        int i;
        while((i=in.read())!=-1)
        {
        	System.out.print((char)i);

        }
		

	}

}
