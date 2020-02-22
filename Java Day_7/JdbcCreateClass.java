package com.day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCreateClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
     Class.forName("com.mysql.jdbc.Driver");


		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection conn=DriverManager.getConnection(url, "root", "root");
		System.out.println(conn.getClass().getName());
		Statement stmt= conn.createStatement();
		
		
//		String query="update person set address='Thane' where id=3";
//		String query="insert into person values(3,'Nimish','Mumbai')";
		//String query="create table person(id int primary key, name varchar(50),address varchar(100))";
//		String query="alter table person add Location varchar(100) after name";
//		String query="delete from person where id=2 ";
		String query= "select* from person";
//        stmt.executeUpdate(query);
		
          ResultSet rs= stmt.executeQuery(query);
		
		while(rs.next())
		{
           System.out.println(rs.getInt("id")+":"+rs.getString("name")+":"+rs.getString("address"));
			
		}
		}

	

}
