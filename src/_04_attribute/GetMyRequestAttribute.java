package _04_attribute;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import sun.rmi.server.Dispatcher;

@WebServlet("/getmyrequestattribute")
public class GetMyRequestAttribute extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		Person person = (Person) req.getAttribute("person1");
		
	//	System.out.println(person);
		
		//requestattribute e ulasamayiz bunun icin requestdispatch yapilmalidir.
		
	}

}
