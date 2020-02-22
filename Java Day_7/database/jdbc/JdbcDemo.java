package com.day7.database.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//1. Load The Driver
//1.1 By Using ForName() Method
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
//		1.2
		//Driver driver= new com.mysql.jdbc.Driver();
		
//		2. Establish the connection
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection conn=DriverManager.getConnection(url, "root", "root");
		System.out.println(conn.getClass().getName());
		Statement stmt= conn.createStatement();
		
//		String query="insert into employee values(3,'Vijay','Mumbai',40,58966)";
//		String query="update employee set address='Thane' where id=3";
//		String query="delete from employee where id=3";
		String query= "select* from employee";
		ResultSet rs= stmt.executeQuery(query);
		
		while(rs.next())
		{
//			int id=rs.getInt(1);
//			String name=rs.getString(2);
//			String address=rs.getString(3);
//			int age= rs.getInt(4);
//			long phone=rs.getLong(5);
//			System.out.println(id+":"+name+":"+address+":"+age+":"+phone);
			
//			System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getInt(4)+":"+rs.getLong(5));
			System.out.println(rs.getInt("id")+":"+rs.getString("name")+":"+rs.getString("address")+":"+rs.getInt("age")+":"+rs.getLong("phone"));
			
		}
	}
	
}
		
		
		
		
//		int result=stmt.executeUpdate(query);
//		if(result>0)
//		{
//			System.out.println("Record Deleted Successfullly");
//		}else {
//			System.out.println("Something Went Wrong...!!!!!");
//		}
//	}


