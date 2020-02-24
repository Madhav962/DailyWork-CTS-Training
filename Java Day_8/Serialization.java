package com.day8.serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageInputStream;

public class Serialization {
	public static void serilize(Employee employee,String path)
	{
		FileOutputStream fout;
		try {
			fout = new FileOutputStream(path);
			BufferedOutputStream bout= new BufferedOutputStream(fout);
			ObjectOutputStream oos= new ObjectOutputStream(bout);
			oos.writeObject(employee);
			oos.close();
			bout.close();
			fout.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static Object deserilize(String filepath) {
		FileInputStream fin;
		try {
			fin = new FileInputStream(filepath);
			BufferedInputStream bin= new BufferedInputStream(fin);
			ObjectInputStream ooi= new ObjectInputStream(bin);
			Object obj = ooi.readObject();
			ooi.close();
			bin.close();
			
			return obj;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		
	}

	public static void main(String[] args) {
		
//		Employee employee =new Employee(101, "Nikhil", "Mumbai", 24, 4466, 46451135);
//		serilize(employee,"employee.txt");
//		System.out.println("Object Saved Successfully");
		
		Employee employee=(Employee) deserilize("employee.txt");
		System.out.println(employee);

	}

}
