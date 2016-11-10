package _03_response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookietest")
public class CookieTest extends HttpServlet{
	
	//Cookie ler tarayýcý tarafýndan saklanan kucuk bilgilerdir...
	//Tarayici tamamen kapatilirsa cookie silinir.
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Cookie cookieName = new Cookie("name", "tolga");
		Cookie cookiePassword = new Cookie("password", "123");
		
		resp.addCookie(cookieName);
		resp.addCookie(cookiePassword);

	}

}
