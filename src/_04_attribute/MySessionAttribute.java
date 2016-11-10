package _04_attribute;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//attribute; request-session-context gibi scopelara eklenen objelerdir...
//context attribute tum proje icin gecerlidir farklý tarayici da olsa etki etmez calisir her turlu...
//ayni tarayicida ayni session gecerlidir...farkli tarayicida null aticaktir...
//Ýlk mysessionattribute sonra getmysessionattribute calistiginda ayni tarayici olmak sartiyla...


@WebServlet("/mysessionattribute")
public class MySessionAttribute extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		Person person = new Person("name", "surname");
		//setAttribute un ikinci parametresi object oldugu yani(person) unutma...
		session.setAttribute("person1", person);
		
	}

}
