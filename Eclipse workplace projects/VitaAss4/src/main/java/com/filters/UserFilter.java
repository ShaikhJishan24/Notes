package com.filters;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpFilter;
import java.io.FileWriter;
import java.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class UserFilter extends HttpFilter implements Filter {
       
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		try(FileWriter fw = new FileWriter("user.txt", true)) 
		{

			String uname = request.getParameter("user");			
			fw.write(uname + "123"); 
		
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		chain.doFilter(request, response);
	}

	

}
