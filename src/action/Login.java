package action;

import db.LoginDA;
import model.Loginer;

import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet{
	Loginer loginer = null;
	String loginID;
	String password;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		LoginDA.initialize();
		
		String data="n";
		HttpSession session = req.getSession();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");

		try 
		{
			
			loginID = req.getParameter("LoginID");
			password = req.getParameter("Password");
			
			PrintWriter out = resp.getWriter();
			loginer = LoginDA.find(loginID);
			if(loginer != null)
			{
				if(loginer.getPassword().equals(password))
				{
					System.out.println(loginer.getPassword());
					session.setAttribute("loginer",loginer);
					data = "y";
				}
			}
			
			out.print(data);
			out.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		LoginDA.terminate();
		
	}
}
