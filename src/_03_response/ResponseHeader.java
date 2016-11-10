package _03_response;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseheader")
public class ResponseHeader extends HttpServlet {
	
	//response header eklenebilir
	// setheader ve addheader ile..
	// setheader oncesinde ayni isimde header varsa owerride edicektir, addheader ise etmez baþka yeni header ekler...
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setHeader("name", "tol");
		resp.setHeader("name", "tolga");
		
		resp.addHeader("surname", "er");
		resp.addHeader("surname", "erg");
		resp.addHeader("surname", "ergun");
		
		String myName  = resp.getHeader("name");
		System.out.println(myName);
		
		Collection<String> mySurnames = resp.getHeaders("surname");
		
		for(String surname: mySurnames){
			System.out.println(surname);
		}
		

	}
	

}
