package com.servlet.context;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.ConfigFile;

import jdk.nashorn.internal.runtime.regexp.joni.Config;


public class ConnectionServlet2 extends HttpServlet {
	String user,password,url,driver;
	java.sql.Connection con;
	ServletContext context;
	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
		user=context.getInitParameter("userName");
		password=context.getInitParameter("password");
		url=context.getInitParameter("url");
		driver=context.getInitParameter("driver");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			System.out.println(con);
			System.out.println(config+"from CS2");
			System.out.println(context+"from CS2");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Hello from service");
	}

}
