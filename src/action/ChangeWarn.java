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

@WebServlet("/ChangeWarn")
public class ChangeWarn extends HttpServlet{
	Part part;
	
	String partName;
	String partType;
	int warnNum;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PartDA.initialize();
		
		String data="n";
		HttpSession session = req.getSession();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");

		try 
		{
			
			partName = req.getParameter("PartName");
			partType = req.getParameter("PartType");
			if(req.getParameter("WarnNum") != null)
				warnNum =Integer.parseInt( req.getParameter("WarnNum"));
			if(partName != null)
			{
				part = PartDA.findbytwo(partName, partType);
				part.setWarnNum(warnNum);
				PartDA.change(part);
				
				ArrayList<Part> list = new ArrayList<Part>();
				list=PartDA.findall();
				session.setAttribute("partList",list);
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		PartDA.terminate();
		
	}
}
