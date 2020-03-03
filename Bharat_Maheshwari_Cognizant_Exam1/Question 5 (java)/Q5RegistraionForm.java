package com.test.programs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Q5RegistraionForm {
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/formdata";
		Connection conn = DriverManager.getConnection(url, "root", "root");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee id : ");
		int employee_id = Integer.parseInt(br.readLine());
		System.out.println("Enter Employee Name : ");
		String name = br.readLine();
		System.out.println("Enter Employee Designation : ");
		String designation = br.readLine();
		System.out.println("Enter Employee Department : ");
		String department = br.readLine();
		String insert_query = "insert into Employee_details values(?,?,?,?)";
	
		
		// for insertion into table
		PreparedStatement ps = conn.prepareStatement(insert_query);
		ps.setInt(1, employee_id);
		ps.setString(2, name);
		ps.setString(3, designation);
		ps.setString(4, department);
		
		
		// for insertion into table
		int insert_result = ps.executeUpdate();
		if (insert_result > 0) {
			System.out.println("Data inserted succesfully");
		} else {
			System.out.println("Something went wrong in insertion");
		}
	}
}