package com.techment.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class laptopPrice
 */
@WebServlet("/laptopPrice")
public class laptopPrice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int price=7000;
		
		PrintWriter pw=response.getWriter();
		int quantity=Integer.parseInt(request.getParameter("laptop"));
	    pw.println("you have selected"+quantity);
	    double Totalprice=quantity*price;
	    pw.println("total price"+Totalprice);
	    Cookie cookie=new Cookie("MobilePrice",String.valueOf(Totalprice));
	    response.addCookie(cookie);
	    pw.print("<a href='Cart'>go to cart</a>");
	    
	
	}

}
