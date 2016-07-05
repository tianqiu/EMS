package action;

import db.CustomerDA;
import db.LoginDA;
import db.RepairListDA;
import model.Customer;
import model.RepairList;

import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.research.ws.wadl.Request;

/**
 * Servlet implementation class GetCustomers
 */
@WebServlet("/Check")
public class Check extends HttpServlet{
	RepairList repairList;
	String serviceID;
	String workerID;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		LoginDA.initialize();
		RepairListDA.initialize();
		
		String data="n";
		HttpSession session = req.getSession();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		ArrayList<Customer> list;
		try 
		{
			
			workerID = req.getParameter("WorkerID");
			serviceID = req.getParameter("ServiceID");
			PrintWriter out = resp.getWriter();
			if(serviceID != null)
			{
				repairList = RepairListDA.find(serviceID);
				if(repairList.getWorker().equals(workerID))
				{
					LoginDA.changeState(repairList.getWorker(), 1);
					repairList.setServiceState(2);
					RepairListDA.change(repairList);
					session.setAttribute("check",repairList);
					data = "y";
				}
			}
			else
			{
				data = "n";
			}
			
			//session.setAttribute("customer",list.get(0));
			out.print(data);
			out.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		LoginDA.terminate();
		RepairListDA.terminate();
		
	}
}
