package _03_response;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseexcelldownload")
public class ResponseExcellDownload extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//NOT: Tomcat ile ilgili bir sorundan calistiramadim...

		resp.setContentType("application/ms-excel");
		resp.setHeader("Content-Disposition",
				"attachment; filename=testName.xlsx");

		ServletContext context = getServletContext();

		InputStream inputStream = context.getResourceAsStream("myexcell.xlsx");

		ServletOutputStream sos = resp.getOutputStream();

		int read = 0;
		byte[] bytes = new byte[1024];
		while ((read = inputStream.read(bytes)) != -1) {
			sos.write(bytes,0,read);
		}
		sos.close();

	}
}

