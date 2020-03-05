import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/greet")
public class GreetingServelet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw= resp.getWriter();
		String username= req.getParameter("un");
		String password= req.getParameter("pwd");
		if(username.equals("123")&& password.equals("Sharma"))
		{
		System.out.println("Welcome"+username);
		pw.write("<h1>Welcome "+username+"</h1>");
		}
		else
		{
			System.out.println(" Invalid Input");
			pw.write("<h1>Invalid Input</h1>");
		}
	}
}
