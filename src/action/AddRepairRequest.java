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

/**
 * Servlet implementation class GetCustomers
 */
@WebServlet("/AddRepairRequest")
public class AddRepairRequest extends HttpServlet{
	RepairRequest repairrequest;
	RepairList repairList;
	
	String serviceID;
	String customerID;
	int productType = 0;
	String machineBrand;
	String machineType;
	String serialNumber;
	String lackPart;
	String machineFailPhenomena;
	String machineAttachCheck;
	String passWord;
	String importantInfo;
	String HDD;
	String internalStorage;
	int failType;
	String outPCCard;
	String acAdapter;
	String battery;
	String externalCDROM;
	String externalSoftDrive;
	String others = "";
	String repairTime;
	int estimatedPrice;
	int repairState;
	boolean is;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		db.RepairListDA.initialize();
		RepairRequestDA.initialize();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		HttpSession session = req.getSession();
		try 
		{
			String data = "n";
			
			PrintWriter out = resp.getWriter();
			
			serviceID = req.getParameter("ServiceID");
			customerID = req.getParameter("CustomerID");
			if(req.getParameter("ProductType").equals(""))
				productType = 0;
			else if(req.getParameter("ProductType") != null)
				productType = Integer.parseInt(req.getParameter("ProductType"));
			machineBrand= req.getParameter("MachineBrand");
			machineType= req.getParameter("MachineType");
			serialNumber= req.getParameter("SerialNumber");
			lackPart= req.getParameter("LackPart");
			machineFailPhenomena= req.getParameter("MachineFailPhenomena");
			machineAttachCheck= req.getParameter("MachineAttachCheck");
			passWord= req.getParameter("PassWord");
			importantInfo= req.getParameter("ImportantInfo");
			HDD= req.getParameter("HDD");
			internalStorage= req.getParameter("InternalStorage");
			if(req.getParameter("FailType").equals(""))
				failType = 0;
			else if(req.getParameter("FailType") != null)
				failType = Integer.parseInt(req.getParameter("FailType"));
			outPCCard= req.getParameter("OutPCCard");
			acAdapter= req.getParameter("ACAdapter");
			battery= req.getParameter("Battery");
			externalCDROM= req.getParameter("ExternalCDROM");
			externalSoftDrive= req.getParameter("ExternalSoftDrive");
			others= req.getParameter("Others");
			repairTime= req.getParameter("RepairTime");
			if(req.getParameter("EstimatedPrice") == "")
				estimatedPrice = 0;
			else if(req.getParameter("EstimatedPrice").equals(""))
				estimatedPrice= Integer.valueOf(req.getParameter("EstimatedPrice")).intValue();

			
			
			if(serviceID != null)
			{		
				repairList = new RepairList(serviceID, " ", " ", " ", " ", " ", " ", 0);
				if(RepairListDA.find(serviceID) != null)
					data = "n";
				else 
				{
					repairrequest = new RepairRequest(serviceID,customerID, productType, machineBrand, machineType, serialNumber, lackPart, machineFailPhenomena, machineAttachCheck, passWord, importantInfo, HDD,internalStorage,failType,outPCCard,acAdapter,battery,externalCDROM,externalSoftDrive,others,repairTime,estimatedPrice,repairState);
					is = RepairRequestDA.add(repairrequest);
					RepairListDA.add(repairList);
					data = "y";
				}
				session.setAttribute("repairRequest",repairrequest);
			}
			out.print(data);
			out.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		db.RepairRequestDA.terminate();
		db.RepairListDA.terminate();
		
	}
}
