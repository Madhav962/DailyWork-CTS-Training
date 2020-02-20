package com.file.input.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamCopyingData{

	public static void main(String args[])  throws FileNotFoundException,IOException {
		
		String path="C:\\Users\\admin\\Desktop\\Data.txt";
		String newPath="C:\\Users\\admin\\Desktop\\CopiedData.txt";
		File file= new File(path);
        FileInputStream in =new FileInputStream(file);
        FileOutputStream out=new FileOutputStream(newPath);
        int i;
        while((i=in.read())!=-1)
        {
        	out.write(i);

        }
		

	}

}
