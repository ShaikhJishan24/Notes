package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.Model.CareerExpert;


public class CareerServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	CareerExpert ce;
	public void init(ServletConfig config) throws ServletException {
		ce = new CareerExpert();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String qualification = request.getParameter("qali");
		
		String str = ce.getAdvice(qualification);
		request.setAttribute("advice", str);
		
		RequestDispatcher rd = request.getRequestDispatcher("CareerDetails.jsp");
		rd.forward(request, response);
	}

}
