package com.Servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.pojo.NumberPojo1;


public class NumberPojo1serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	NumberPojo1 nb1;
	    
	@Override
	public void init(ServletConfig config) throws ServletException {
		nb1 = new NumberPojo1();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num = Integer.parseInt(request.getParameter("num"));
		nb1.setNum(num);
		
		PrintWriter out = response.getWriter();
		out.println(nb1.sqrt());
		
	}

	

}
