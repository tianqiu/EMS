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
@WebServlet("/GetCustomers")
public class GetCustomers extends HttpServlet{
	Customer customer;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		CustomerDA.initialize();
		
		String data="";
		HttpSession session = req.getSession();
		
		req.setCharacterEncoding("UTF-8");
		

		try 
		{
			ArrayList<Customer> list = new ArrayList<Customer>();
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter out = resp.getWriter();
			list=CustomerDA.findall();	
			System.out.println(list.get(0).getCustomerID());
			data = list.get(0).getCustomerID();
			session.setAttribute("a",list.get(0));
			req.setAttribute("a", list.get(0));
			//Customer aCustomer = (Customer) session.getAttribute("a");
			//System.err.println("WQ" + aCustomer.getCustomerID());
			out.print(data);
			out.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		db.CustomerDA.terminate();
		
	}
}
