package _04_attribute;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//attribute; request-session-context gibi scopelara eklenen objelerdir...
//context attribute tum proje icin gecerlidir farklý tarayici da olsa etki etmez calisir her turlu...

@WebServlet("/myattribute")
public class MyAttribute extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		
		Person person = new Person("name", "surname");
		
		context.setAttribute("person1", person);
		
	}

}
