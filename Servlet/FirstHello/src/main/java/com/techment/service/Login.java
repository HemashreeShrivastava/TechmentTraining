package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Hello this is my first servlet");	
	
	PrintWriter out =response.getWriter();
	out.print("hello wlcome to login page");
	String name=request.getParameter("u");
	String pass=request.getParameter("p");
	int nameLength=name.length();
	System.out.println("name: "+name+"length of name :"+nameLength);
	out.print("your name is "+name+"lenght: "+nameLength);
	
	}

}
