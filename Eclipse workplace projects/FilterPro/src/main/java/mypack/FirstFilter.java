package mypack;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FirstFilter extends HttpFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		try {
			String name = request.getParameter("nm");
			String age = request.getParameter("ag");
			FileWriter fw = new FileWriter("d:\\loginfile.txt");
			fw.write(name);
			fw.write(age);
			fw.close();
			PrintWriter pw = response.getWriter();
			pw.println("<br>Data saved in a file<br>");
			chain.doFilter(request, response);  // it says i am done
		} catch (Exception e) {
			System.out.println("in first" + e);
		}
	}

}
