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
@WebServlet("/ChangeCustomer")
public class ChangeCustomer extends HttpServlet{
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
	String postCode;
	String address;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		CustomerDA.initialize();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");

		try 
		{
			customerID = req.getParameter("CustomerID");
			identificationID = req.getParameter("IdentificationID");
			deliverTime = req.getParameter("DeliverTime");
			customerNature = req.getParameter("CustomerNature");
			fixedPhone = req.getParameter("FixedPhone");
			unitName = req.getParameter("UnitName");
			mobilePhone = req.getParameter("MobilePhone");
			contacts = req.getParameter("Contacts");
			email = req.getParameter("Email");
			postCode = req.getParameter("PostCode");
			address = req.getParameter("Address");
			
			customer = new Customer(customerID, identificationID, deliverTime, customerNature, fixedPhone, unitName, mobilePhone, contacts, email, postCode, address);
			
			CustomerDA.change(customer);		
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		db.CustomerDA.terminate();
		
	}
}
