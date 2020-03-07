package com.validation.form;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidatedServlet
 */
@WebServlet("/ValidatedServlet")
public class ValidatedServlet extends HttpServlet {

@Override
public void init() throws ServletException {
	System.out.println("form init");

}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("form service");
	if(req.getMethod().equals("GET"))
	{
		doGet(req, resp);
		
	}
	else
	{
		doPost(req, resp);
	}

	}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("from doGet");

	}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("from doPost");

	}
}