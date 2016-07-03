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
	String customerID;
	String identificationID;
	String deliverTime;
	String customerNature;
	String fixedPhone;
	String unitName;
	String mobilePhone;
	String contacts;
	String email;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		CustomerDA.initialize();
		
		String data="";
		HttpSession session = req.getSession();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		ArrayList<Customer> list = new ArrayList<Customer>();
		try 
		{
			
			customerID = req.getParameter("CustomerID");
			identificationID = req.getParameter("IdentificationID");
			
			PrintWriter out = resp.getWriter();
			
			
			if(customerID == "" && identificationID == "")
			{
				list = CustomerDA.findall();
			}
			else if(customerID == "" && identificationID != "")
			{
				list = CustomerDA.findbyIDID(identificationID);
			}
			else if(customerID != "" && identificationID == "")
			{
				list = CustomerDA.findbyID(customerID);
			}
			else 
			{
				list = CustomerDA.findbytwo(customerID, identificationID);
			}
			
			session.setAttribute("customerList",list);

			out.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		db.CustomerDA.terminate();
		
	}
}
