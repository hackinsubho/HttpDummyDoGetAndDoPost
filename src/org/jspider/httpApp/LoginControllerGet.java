package org.jspider.httpApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/log")
public class LoginControllerGet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("un");
		String password = req.getParameter("pwd");
		PrintWriter pw = resp.getWriter();
		String out = "<html>" + 
				"<body bgcolor=\"green\">" + 
				"<h1>Welcome "+name+"</h1>" + 
				"</body>" + 
				"</html>";
		pw.println(out);
	}
	
	
}
