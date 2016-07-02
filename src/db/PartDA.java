package db;

import model.Customer;
import model.Part;
import model.RepairList;

import java.sql.*;
import java.util.ArrayList;


public class PartDA{

    static Connection con = null;
    static PreparedStatement pre = null;
    static ResultSet rs = null;
    
    static String partName;
    static String type;
    static int price;
    static int num;
    static String date;
    static int warnNum;
    static int inventoryState;
    
    
	public static Connection initialize()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	        String url = "jdbc:oracle:" + "thin:@localhost:1521:orcl";
	        String user = "C##EMS";
	        String password = "EMS";
	        con = DriverManager.getConnection(url, user, password);
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		catch (SQLException e) {
			System.out.println(e);
		}
		return con;
	}

	public static void terminate()
	{
        try
        {
            if (rs != null)
                rs.close();
            if (pre != null)
                pre.close();
            if (con != null)
                con.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
	}

	//娣诲姞
	
	public static void add(Part inpart)
	{
		 partName=inpart.getPartName();
		 type=inpart.getType();
		 price=inpart.getPrice();
		 num=inpart.getNum();
		 date=inpart.getDate();
		 warnNum=inpart.getWarnNum();
	     inventoryState=inpart.getInventoryState();  
	     try
		    {
		        String sql = "INSERT INTO PART (PARTNAME,TYPE,PRICE,NUM,DATE,WARNNUM,INVENORYSTATE) "
		                     +"VALUES ('"+partName+"','"+type+"','"+price+"','"+num+"','"+date+"','"+warnNum+"','"+inventoryState+"')";
		        pre = con.prepareStatement(sql);
		        pre.executeUpdate();
		       
		    }
		    catch (Exception e)
		    {
		        e.printStackTrace();
		    }

	}
	
	//修改,通过partname和type找到要改的那行，然后修改
	public static void change(Part inpart)
	{
		 partName=inpart.getPartName();
		 type=inpart.getType();
		 price=inpart.getPrice();
		 num=inpart.getNum();
		 date=inpart.getDate();
		 warnNum=inpart.getWarnNum();
	     inventoryState=inpart.getInventoryState();  
		
		try{
			  String sql = "Update PART SET  TYPE = '"+type+"',"+" PRICE = '"+price+"',"
        		      +" NUM = '"+num+"',"+" DATE = '"+date+"',"+" WARNNUM = '"
                      +warnNum+"',"+" INVENTORYSTATE = '"+inventoryState+"'"+" WHERE PARTNAME="+partName;
			pre = con.prepareStatement(sql);
			pre.executeUpdate();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	
	//查询,按partname，找到所有的行，返回那些行的type组成的数组

	public static ArrayList<String> findbyname(String inpartName)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		
		try
	    {
	        String sql = "select * from PART WHERE PARTNAME = '" + inpartName +"'";
	        
	        pre = con.prepareStatement(sql);
	        rs = pre.executeQuery();
	        while (rs.next())
	        {
	        	partName=rs.getString("PARTNAME");
	            type=rs.getString("TYPE");
	            price=rs.getInt("PRICE");
	            num=rs.getInt("NUM");
	            date=rs.getString("DATE");
	            warnNum=rs.getInt("WARNNUM");
	            inventoryState=rs.getInt("INVENTORYSTATE");
	        	
	            Part part = new Part(partName,type,price,num,date,warnNum,inventoryState);
	        	list.add(part);
	        }
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
				
		
		return list;
	}
	
	//查询,按partname和type综合查询满足条件的那行

	public static Part findbytwo(String inpartName, String intype)
	{
		Part part = null;
		
		 try
		    {
		        String sql = "select * from PART WHERE PARTNAME = '" + inpartName +"'"
		        		     + "AND TYPE = '" + intype + "'";
		        pre = con.prepareStatement(sql);
		        rs = pre.executeQuery();
		        while (rs.next())
		        {
		        	partName=rs.getString("PARTNAME");
		            type=rs.getString("TYPE");
		            price=rs.getInt("PRICE");
		            num=rs.getInt("NUM");
		            date=rs.getString("DATE");
		            warnNum=rs.getInt("WARNNUM");
		            inventoryState=rs.getInt("INVENTORYSTATE");
		        	
		            part = new Part(partName,type,price,num,date,warnNum,inventoryState);
		        	
		        }
		    }
		    catch (Exception e)
		    {
		        e.printStackTrace();
		    }
		
		return part;
	}
	
	//查询所有

	public static ArrayList<Part> findall()
	{
		ArrayList<Part> list = new ArrayList<Part>();
		
		  try
		    {
		        String sql = "select * from PART";
		        pre = con.prepareStatement(sql);
		        rs = pre.executeQuery();
		        while (rs.next())
		        {
		        	
		        	partName=rs.getString("PARTNAME");
		            type=rs.getString("TYPE");
		            price=rs.getInt("PRICE");
		            num=rs.getInt("NUM");
		            date=rs.getString("DATE");
		            warnNum=rs.getInt("WARNNUM");
		            inventoryState=rs.getInt("INVENTORYSTATE");
		        	
		        	
		        	Part part = new Part(partName,type,price,num,date,warnNum,inventoryState);
		        	list.add(part);
		        }
		    }
		    catch (Exception e)
		    {
		        e.printStackTrace();
		    }

		return list;
	}
}
