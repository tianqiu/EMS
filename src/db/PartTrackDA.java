package db;

import model.Part;
import model.PartTrack;

import java.sql.*;
import java.util.ArrayList;


public class PartTrackDA{

    static Connection con = null;
    static PreparedStatement pre = null;
    static ResultSet rs = null;
    
    
    static String partName;
    static int inOut;
    static String type;
    static String serviceID;
    static int num;
    static int price;
    static String deliveryTime;
	
	
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

	//添加
	public static void add(PartTrack inparttrack)
	{
		
		
	    partName=inparttrack.getPartName();
	    inOut=inparttrack.getInOut();
	    type=inparttrack.getType();
	    serviceID=inparttrack.getServiceID();
	    num=inparttrack.getNum();
	    price=inparttrack.getPrice();
	    deliveryTime=inparttrack.getDeliveryTime();
	   
	     try
		    {
		        String sql = "INSERT INTO PARTTRACK (PARTNAME,INOUT,TYPE,SEVECEID,NUM,PRICE,DELIVERYTIME) "
		                     +"VALUES ('"+partName+"','"+inOut+"','"+type+"','"+serviceID+"''"+num+"','"+price+"','"+deliveryTime+"')";
		        pre = con.prepareStatement(sql);
		        pre.executeUpdate();
		       
		    }
		    catch (Exception e)
		    {
		        e.printStackTrace();
		    }

	}

	//查询所有
	public static ArrayList<PartTrack> findall()
	{
		ArrayList<PartTrack> list = new ArrayList<PartTrack>();
		
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
	            inOut=rs.getInt("DATE");
	            serviceID=rs.getString("WARNNUM");
	            deliveryTime=rs.getString("INVENTORYSTATE");
	        	
	        	PartTrack partTrack = new PartTrack(partName,inOut,type,serviceID,num,price,deliveryTime);
	        	list.add(partTrack);
	        }
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
		return list;
	}
}
