package mypack;

import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class SecondFilter extends HttpFilter implements Filter {
       
    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
		
		try
		{
			int age=Integer.parseInt(request.getParameter("ag"));
			PrintWriter pw=response.getWriter();
			if(age<18)
			{
				pw.println("voting not allowed<br>");
			}
			else
			{
				pw.println("voting allowed<br>");
			}

			chain.doFilter(request,response);

		}
		catch(Exception e)
		{
			System.out.println("in first"+e);
		}
	}

	

}
