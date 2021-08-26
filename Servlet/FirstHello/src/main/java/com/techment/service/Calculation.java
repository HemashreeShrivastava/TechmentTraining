package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculation
 */
@WebServlet("/Calculation")
public class Calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String whichCalculation=request.getParameter("calculation");
		PrintWriter out =response.getWriter();
		String num1=request.getParameter("n1");
		String num2=request.getParameter("n2");
		
		int n1= Integer.parseInt(num1);
		int n2= Integer.parseInt(num2);
		if(whichCalculation.equalsIgnoreCase("Add"))
		{
		
		
		System.out.println("the sum of two number are"+" :"+(n1+n2));
		out.print("the sum of two number are"+" :"+(n1+n2));
		}
		else if(whichCalculation.equalsIgnoreCase("Sub"))
		{
			System.out.println("the subtration of two number are"+" :"+(n1-n2));
			out.print("the subtration of two number are"+" :"+(n1-n2));

		}
		else if(whichCalculation.equalsIgnoreCase("Mul"))
		{
			System.out.println("the multiplication of two number is"+" :"+(n1*n2));
			out.print("the multiplication of two number  is"+" :"+(n1*n2));

		}
		else if(whichCalculation.equalsIgnoreCase("Div"))
		{
			System.out.println("the division of two number are"+" :"+(n1/n2));
			out.print("the division of two number are"+" :"+(n1/n2));

		}
		else
		{
			System.out.println("error");
			out.print("error");
		}
		
	}

}
