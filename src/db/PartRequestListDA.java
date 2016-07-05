package db;

import model.PartRequestList;

import java.sql.*;
import java.util.ArrayList;


public class PartRequestListDA{

    static Connection con = null;
    static PreparedStatement pre = null;
    static ResultSet rs = null;
    
    
    static String partName;
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

	//娣诲姞
	public static void add(PartRequestList inpartrequestlist)
	{
		partName = inpartrequestlist.getPartName();
		type = inpartrequestlist.getType();
		serviceID = inpartrequestlist.getServiceID();
		num = inpartrequestlist.getNum();
		price = inpartrequestlist.getPrice();
		deliveryTime = inpartrequestlist.getDeliveryTime();
		
		  try
		    {
		        String sql = "INSERT INTO PARTREQUESTLIST (PARTNAME,TYPE,SERVICEID,NUM,PRICE,DELIVERYTIME) "
		                     +"VALUES ('"+partName+"','"+type+"','"+serviceID+"',"+num+","+price+",'"+deliveryTime+"')";
		        pre = con.prepareStatement(sql);
		        pre.executeUpdate();
		       
		    }
		    catch (Exception e)
		    {
		        e.printStackTrace();
		    }

	}

	//鍒犻櫎
	public static void del(String inserviceID)
	
	{
		
		try
    {
        String sql = "DELETE FROM PARTREQUESTLIST "+"WHERE SERVICEID='" + inserviceID+"'";
        pre = con.prepareStatement(sql);
        pre.executeUpdate();
    }
        catch (Exception e)
    {
        e.printStackTrace();
    }
		

	}	

	//鏌ヨ鎵�湁
	public static ArrayList<PartRequestList> findall()
	{
		
		
		ArrayList<PartRequestList> list = new ArrayList<PartRequestList>();
	    try
	    {
	        String sql = "select * from PARTREQUESTLIST";
	        pre = con.prepareStatement(sql);
	        rs = pre.executeQuery();
	        while (rs.next())
	        {
	        	partName = rs.getString("PARTNAME");
	        	type = rs.getString("TYPE");
	        	serviceID = rs.getString("SERVICEID");
	        	num = rs.getInt("NUM");
	        	price = rs.getInt("PRICE");
	        	deliveryTime = rs.getString("DELIVERYTIME");
	      
	        	
	        	PartRequestList partrequestlist = new PartRequestList(partName,type,serviceID,num,price,deliveryTime);
	        	list.add(partrequestlist);
	        }
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    return list;
	}
		
		
}	
