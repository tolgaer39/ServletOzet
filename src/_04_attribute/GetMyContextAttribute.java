package _04_attribute;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getmycontextattribute")
public class GetMyContextAttribute extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		Person person = (Person) context.getAttribute("person1"); //MyAttribute te tanimlanan context public oldugu icin person1 e ulasabiliyorum...
		
		System.out.println(person);
	}

}
