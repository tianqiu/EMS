package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import db.*;
import model.*;

@WebServlet("/GetParts")
public class GetParts extends HttpServlet {

	Part part = null;
	String partName;
	String partType;
	int partPrice;
	int partNum;
	String date;
	int warnNum;
	int inventoryState;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PartDA.initialize();
	
		HttpSession session = req.getSession();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		try 
		{							
			
			
			ArrayList<Part> list = new ArrayList<Part>();
			list=PartDA.findall();

			session.setAttribute("partList",list);
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		PartDA.terminate();		
	}
}
