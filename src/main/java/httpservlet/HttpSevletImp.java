package httpservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HttpSevletImp extends HttpServlet
{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pr=resp.getWriter();
		
		pr.println("<h1>Hiii I am Kishor Shembe</h1>");
		pr.println("<h2>The current time is "+new Date());
	}
}
