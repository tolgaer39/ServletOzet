package _01_servletcontext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServletContext extends HttpServlet {
	
	//ServletConfig objesini kullanarak servletlere ait init parametrelerine ulasabiliriz. 
	//her servlet icin servletconfig objesi vardýr
	//servletcontext objesini kullarak context parametrelerine ulasabiliyoruz.
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		
		String myurl = context.getInitParameter("url");
		
		PrintWriter pw = resp.getWriter();
		pw.print(myurl);
	}
}
