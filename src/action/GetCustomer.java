package action;

import db.CustomerDA;
import model.Customer;

import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetCustomers
 */
@WebServlet("/GetCustomer")
public class GetCustomer extends HttpServlet{
	Customer customer;
	String customerID;
	String identificationID;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		CustomerDA.initialize();
		
		String data="";
		HttpSession session = req.getSession();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		ArrayList<Customer> list;
		try 
		{
			
			customerID = req.getParameter("CustomerID");
			
			PrintWriter out = resp.getWriter();
			
			
			list = CustomerDA.findbyID(customerID);
			
			session.setAttribute("customer",list.get(0));

			out.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		db.CustomerDA.terminate();
		
	}
}
