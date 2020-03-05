package com.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SourceServlet2")
public class SourceServlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("from doGet of Sourceservlet2");
String cusname=req.getParameter("CustomerName");
int term= Integer.parseInt(req.getParameter("Term"));
int premium= Integer.parseInt(req.getParameter("Premium"));
//mapping targetServlet into source servlet
req.setAttribute("customerName", cusname);
req.setAttribute("No.ofYears", term);
req.setAttribute("amount", premium);
System.out.println("Amount paid by you=="+(premium*term));
PrintWriter pw= resp.getWriter();
pw.write("<h1> Your Paid Amount &nbsp;&nbsp;"+premium*term+"</h1>");

resp.sendRedirect("http://localhost:8080/WebApp2/project.html");
//RequestDispatcher dispatcher= req.getRequestDispatcher("/http://localhost:8080/WebApp2/project.html");
//dispatcher.include(req, resp);
	}
}
