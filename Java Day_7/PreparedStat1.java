package com.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class PreparedStat1 {

	public static <Result> void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("Enter Employee id: ");
		   int id=Integer.parseInt(br.readLine());
		   System.out.println("Enter Employee Name: ");
		   String name=br.readLine();
		   System.out.println("Enter Employee Address: ");
		   String address=br.readLine();
		   System.out.println("Enter Employee Age: ");
		   int age=Integer.parseInt(br.readLine());
		   System.out.println("Enter Employee PhoneNumber: ");
		   long phone=Long.parseLong(br.readLine());
		   
		   
		   
		    Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ctspune";
			Connection conn=DriverManager.getConnection(url, "root", "root");
//			String query="insert into employee values(?,?,?,?,?)";
//			String query="delete from employee where id=?";
			String query="select*from employee";
			PreparedStatement ps= conn.prepareStatement(query);
          
            
//			ps.setInt(1,id);
//			ps.setString(2,name);
//			ps.setString(3,address);
//			ps.setInt(4,age);
//			ps.setLong(5,phone);
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("id")+":"+rs.getString("name")+":"+rs.getString("address"));

			}
		
			

	}



}
