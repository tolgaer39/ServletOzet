package _02_request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestpostform")
public class RequestPostForm extends HttpServlet {

	// doPost owerride ediyoruz...html den buraya post ile gelecektir
	
	//get ile post un farki
	//gette url adresinin icinde girdigim degerler gorulur
	//postta ise forma girilen parametreler gorunmuyor ve gete gore daha guvenlidir.
	//linkler get ile calisir, form varsa tabi guvenlik acisindan post kullanilir projelerde... 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		// req objesi uzerinden getParameter kullanarak html elemanýna girdigim valuye ulasýyorum...
		//firsName burda htmlde input alaninin name kismina karsilik gelir...
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String gender = req.getParameter("gender");
		String maritalStatus = req.getParameter("marital status");
		
		//Checkbuslarda sadece ilk secileni dondurur...
		//Bunu asabilmek icin birden fazla degere ulasabilmek icin ise; String[] langs = req.getParameterValues("lang")
		String lang = req.getParameter("lang");
		String[] langs = req.getParameterValues("lang");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(gender);
		//System.out.println(lang);
		System.out.println(maritalStatus);
		
		for(String lang2:langs){
		System.out.println(lang2);
		}
	}
	
}
