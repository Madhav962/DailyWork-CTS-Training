package com.book;

import java.io.IOException;

public class FileWriterD {
public static void main(String args[]) throws IOException{
	
	String path="C:\\Users\\admin\\Desktop\\Book.txt";
	FileWriter out= new Filewriter(path);
	String msg="File Writed Data";
	String msg="File Writed Data";
	String msg="File Writed Data";
	out.write(bookname+"\t"+authorname+"\t"+price+"\n");
	out.close();
	
}
