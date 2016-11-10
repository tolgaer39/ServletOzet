package _01_servletcontext;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//web.xml dosyasinda yaptigimiz tanimi burada yapabiliriz.....
@WebServlet("/getresources")
public class GetResources extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//servletcontext objesi üzerinden projedeki kaynaklara erisim saglariz...
		ServletContext context = getServletContext();
		
		//txt dosyasi al...
		InputStream is = context.getResourceAsStream("c:\test.txt");
		
		int oku;
		while((oku=is.read())!=-1){
			System.out.println((char)oku);
		}
		
		//properties dosyasý al... myfolder dizini altinda oldugu icin myfolder/ demek gerek....
		InputStream is2 = context.getResourceAsStream("myfolder/myproperties.properties");
		
		Properties prop = new Properties();
		prop.load(is2);
		
		String myName = prop.getProperty("name");
		String mySurname = prop.getProperty("surname");
		String age = prop.getProperty("age");
		
		System.out.println(myName);
		System.out.println(mySurname);
		System.out.println(age);
		
	}

}

