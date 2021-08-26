package com.techment.AgeCalculator;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgeCalculator
 */
@WebServlet("/AgeCalculator")
public class AgeCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out= response.getWriter();
		String name=request.getParameter("name");
		String dob=request.getParameter("dob");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate today=LocalDate.now();
		LocalDate   date       = LocalDate.parse(dob);
		out.println(date);
		out.println(dob);
		//Period	period=Period.between(date,today);
		//System.out.println(period.getYears()+"years"+period.getMonths()+"months"+period.getDays()+"days");
		
	
	}

}
