package db;

import model.Checkout;

import java.sql.*;
import java.util.ArrayList;


public class CheckoutDA{

    static Connection con = null;
    static PreparedStatement pre = null;
    static ResultSet rs = null;
    
    
    static String serviceID;
	static int serviceCost;
	static int materialCost;
	static String serviceCommitment;
	static String caution;
	static String endDate;
    
    
    
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

	//濞ｈ濮�
	public static void add(Checkout incheckout)
	{
	
		serviceID = incheckout.getServiceID();
		serviceCost = incheckout.getServiceCost();
		materialCost = incheckout.getMaterialCost();
		serviceCommitment = incheckout.getServiceCommitment();
		caution = incheckout.getCaution();
		endDate = incheckout.getEndDate();
		
		
		  try
		    {
		        String sql = "INSERT INTO CHECKOUT (SERVICEID,SERVICECOST,MATERIALCOST,SERVICECOMMITMENT,CAUTION,ENDDATE) "
		                     +"VALUES ('"+serviceID+"','"+serviceCost+"','"+materialCost+"','"+serviceCommitment+"','"+caution+"','"+endDate+"')";
		        pre = con.prepareStatement(sql);
		        pre.executeUpdate();
		       
		    }
		    catch (Exception e)
		    {
		        e.printStackTrace();
		    }


	}

	//閸掔娀娅�
	public static void del(String inserviceID)
	{	
		
		try
    {
        String sql = "DELETE FROM CHECKOUT "+"WHERE SERVICEID=" + inserviceID;
        pre = con.prepareStatement(sql);
        pre.executeUpdate();
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
		
		

	}

	//閺屻儴顕楅敍灞剧壌閹圭晣erviceID閺夈儲鐓＄拠锟�
	public static Checkout find(String inserviceID)
	{
		Checkout checkout = null;
		  try
		    {
		        String sql = "select * from CHECKOUT WHERE SERVICEID = '" + inserviceID +"'";
		        pre = con.prepareStatement(sql);
		        rs = pre.executeQuery();
		        while (rs.next())
		        {
		        	
		        	serviceID = rs.getString("SERVICEID");
		        	serviceCost = rs.getString("SERVICECOST");
		        	materialCost = rs.getString("MATERIALCOST");
		        	serviceCommitment = rs.getString("SERVICECOMMITMENT");
		        	caution = rs.getString("CAUTION");
		        	endDate = rs.getString("ENDDATE");
		        	
		        	Checkout checkout = new Checkout(serviceID,serviceCost,materialCost,serviceCommitment,caution,endDate);
		        	
		        }
		    }
		    catch (Exception e)
		    {
		        e.printStackTrace();
		    }
		  
		return checkout;
	}
}
