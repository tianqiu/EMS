package action;

import db.*;
import model.*;

import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Distribute")
public class Distribute extends HttpServlet{
	String serviceID;
	String workerID;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		CustomerDA.initialize();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");

		try 
		{
			serviceID = req.getParameter("ServiceID");
			workerID = req.getParameter("WorkerID");
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		db.CustomerDA.terminate();
		
	}
}
