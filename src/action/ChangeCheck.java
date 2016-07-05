package action;

import db.*;
import model.*;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.research.ws.wadl.Request;

@WebServlet("/ChangeCheck")
public class ChangeCheck extends HttpServlet{
	RepairList repairList;
	PartRequestList partRequest;
	
	String worker;
	String inspectionRecord;
	String serviceRecord;
	String partName;
	String partType;
	String serviceID;
	int partNum = 0;
	int price;
	String serviceTime;
	String deliveryTime = "null";
	String workLoad;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		LoginDA.initialize();
		RepairListDA.initialize();
		PartRequestListDA.initialize();
		
		String data="n";
		HttpSession session = req.getSession();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		ArrayList<Customer> list;
		try 
		{
			PrintWriter out = resp.getWriter();
			
			serviceID = req.getParameter("ServiceID");
			worker = req.getParameter("Worker");
			inspectionRecord = req.getParameter("InspectionRecord");
			serviceRecord = req.getParameter("ServiceRecord");
			serviceTime = req.getParameter("ServiceTime");
			workLoad = req.getParameter("WorkLoad");
			partName = req.getParameter("PartName");
			partType = req.getParameter("PartType");
			if(req.getParameter("PartNum") != null)
				partNum = Integer.parseInt(req.getParameter("PartNum"));
			
			if(serviceID != null)
			{
				repairList = RepairListDA.find(serviceID);
				repairList.setInspectionRecord(inspectionRecord);
				repairList.setServiceRecord(serviceRecord);
				repairList.setServiceTime(serviceTime);
				repairList.setWorkLoad(workLoad);
				RepairListDA.change(repairList);
				partRequest = new PartRequestList(partName, partType, serviceID, partNum, price, deliveryTime);
				PartRequestListDA.add(partRequest);
			}
			else
			{
				
			}
			out.print("a");
			out.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		LoginDA.terminate();
		RepairListDA.terminate();
		PartRequestListDA.terminate();
		
	}
}
