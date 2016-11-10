package _01_servletcontext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamTest extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		ServletConfig config = getServletConfig();
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		
		//System.out.println(username);
		//System.out.println(password);
		
		PrintWriter pw = resp.getWriter();
		pw.print(username);
		pw.print(password);
		
		ServletContext context = getServletContext();
        String myurl = context.getInitParameter("url");
		pw.print(myurl);	
		}
}
