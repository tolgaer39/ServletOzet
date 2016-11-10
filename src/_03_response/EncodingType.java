package _03_response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/encodingtype")
public class EncodingType extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//bu methodu browsera yazd�rmadan once kullanmamiz gerekir...PrintWriter tanimlamasindan once yazmazsak bir anlami olmaz...
		//resp.setCharacterEncoding("UTF-8");
		//setCharacterEncoding methodu ya da setContentType methodu kullanilabilir. Response objesi uzerinden ikisi de ayni isi gorur...
		resp.setContentType("text/html; charset=UTF-8");
		
		//taray�c�ya veri basmak icin getwriter methodunu kullan�yorduk...
		PrintWriter pw = resp.getWriter();
		pw.print("hello\n");
		
		//varsay�lan olarak esponse encoding �so 5559 1 dir.Bunu console da gorelim...
		String characterEncodingType = resp.getCharacterEncoding();
		System.out.println(characterEncodingType);

		//html dosyas�na charset veriyom turkce karekter sikitisini gidermesi icin...
		pw.print("<head><meta charset='UTF-8'></head>");
		pw.print("<html>");
		pw.print("<body>");
		pw.print("�������");
		pw.print("<body>");
		pw.print("</html>");
	}

}
