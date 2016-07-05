package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import db.LoginDA;
import db.PartDA;
import model.Customer;
import model.Loginer;
import model.Part;

@WebServlet("/AddPart")
public class AddPart extends HttpServlet {

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
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		Date currentTime = new Date(999999);
		String dateString = formatter.format(currentTime);
		System.out.println(dateString);
		
		
		PartDA.initialize();
	
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		try 
		{
			partName = req.getParameter("PartName");
			partType = req.getParameter("PartType");
			if(req.getParameter("PartNum") != null)
				partNum = Integer.parseInt(req.getParameter("PartNum"));
			if(req.getParameter("PartPrice") != null)
				partPrice =Integer.parseInt( req.getParameter("PartPrice"));
			warnNum=3;
			inventoryState=0;
			if(partName != null)
			{
				System.out.println(partName+","+partType+","+partNum+","+partPrice+","+warnNum+","+","+inventoryState);
				
				part = PartDA.findbytwo(partName,partType);
				if(part != null)
				{
					part.setNum(part.getNum()+partNum);	
					PartDA.change(part);
				}
				else
				{
					part = new Part(partName, partType, partPrice, partNum, dateString, warnNum, 0);
					PartDA.add(part);
				}
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		PartDA.terminate();		
	}
}
