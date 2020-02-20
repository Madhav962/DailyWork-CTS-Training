package com.file.input.output;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferFileInputStreamCopyingData{

	public static void main(String args[])  throws FileNotFoundException,IOException {
		
		String path="C:\\Users\\admin\\Desktop\\Data1.txt";
		String newPath="C:\\Users\\admin\\Desktop\\CopiedData1.txt";
		File file= new File(path);
        FileInputStream in =new FileInputStream(file);
        BufferedInputStream bin= new BufferedInputStream(in);
        FileOutputStream out=new FileOutputStream(newPath);
        BufferedOutputStream bout = new BufferedOutputStream(out);
        int i;
        while((i=bin.read())!=-1)
        {
        	bout.write(i);

        }
        bin.close();
        bout.close();
		

	}

}
