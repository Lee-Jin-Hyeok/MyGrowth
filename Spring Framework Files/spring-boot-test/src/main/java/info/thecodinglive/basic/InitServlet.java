package info.thecodinglive.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/init")
public class InitServlet extends HttpServlet {
	public void init() throws ServletException {
		System.out.println("init call");
	}
}
