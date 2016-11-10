package _02_request;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/morerequestmethods")
public class MoreRequestMethods extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//request objesini kullanarak tarayýcýda yer alan gizli header bilgilerine ulasabiliyoruz.
	//	String host = req.getHeader("host");
		Enumeration <String> headerisimleri = req.getHeaderNames();
		
		while(headerisimleri.hasMoreElements()){
			String headerNames = headerisimleri.nextElement();
			System.out.println(headerNames +""+req.getHeader(headerNames));
		}
		
	}
}
