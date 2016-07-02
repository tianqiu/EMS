package db;

import model.Part;
import model.RepairList;

import java.sql.*;
import java.util.ArrayList;


public class RepairListDA{

   static Connection con = null;
   static PreparedStatement pre = null;
   static ResultSet rs = null;
    
   static String serviceID;
   static String worker;
   static String inspectionRecord;
   static String serviceRecord;
   static String serviceTime;
   static String workLoad;
   static String neededPart;
   static int serviceState;
    
    
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
	public static void add(RepairList inrepairlist)
	{
		serviceID = inrepairlist.getServiceID();
		worker = inrepairlist.getWorker();
		inspectionRecord = inrepairlist.getInspectionRecord();
		serviceRecord = inrepairlist.getServiceRecord();
		serviceTime = inrepairlist.getServiceTime();
		workLoad = inrepairlist.getWorkLoad();
		neededPart = inrepairlist.getNeededPart();
		serviceState = inrepairlist.getServiceState();
		
		
		
		
		
		  try
		    {
		        String sql = "INSERT INTO REPAIRLIST (SERVICEID,WORKER,INSPECTIONRECORD,SERVICERECORD,SERVICETIME,WORKLOAD,NEEDEDPART,SERVICESTATE) "
		                     +"VALUES ('"+serviceID+"','"+worker+"','"+inspectionRecord+"','"+serviceRecord+"','"+serviceTime+"','"+workLoad+"','"+neededPart+"','"+serviceState+"')";
		        pre = con.prepareStatement(sql);
		        pre.executeUpdate();
		       
		    }
		    catch (Exception e)
		    {
		        e.printStackTrace();
		    }

	}

	//鏌ヨ
	public static RepairList find(String inserviceID)
	{
		RepairList repairlist = null;
		
		  try
		    {
		        String sql = "select * from REPAIRLIST WHERE SERVICEID = '" + inserviceID +"'";
		        pre = con.prepareStatement(sql);
		        rs = pre.executeQuery();
		        while (rs.next())
		        {
		        	
		        	serviceID = rs.getString("SERVICEID");
		        	worker = rs.getString("WORKER");
		        	inspectionRecord = rs.getString("INSPECTIONRECORD");
		        	serviceRecord = rs.getString("SERVICERECORD");
		        	serviceTime = rs.getString("SERVICETIME");
		        	workLoad = rs.getString("WORKLOAD");
		        	neededPart = rs.getString("NEEDEDPART");
		        	serviceState = rs.getInt("SERVICESTATE");
		        	
		            repairlist = new RepairList(serviceID,worker,inspectionRecord,serviceRecord,serviceTime,workLoad,neededPart,serviceState);		        	
		        }
		    }
		    catch (Exception e)
		    {
		        e.printStackTrace();
		    }
		
		
		
		
		
		
		
		
		
		return repairlist;
	}	

	//淇敼锛屾牴鎹畇erviceID鎵惧埌瀵瑰簲琛岃繘琛屼慨鏀�
	public static void change(RepairList inrepairlist)
	{
		serviceID = inrepairlist.getServiceID();
		worker = inrepairlist.getWorker();
		inspectionRecord = inrepairlist.getInspectionRecord();
		serviceRecord = inrepairlist.getServiceRecord();
		serviceTime = inrepairlist.getServiceTime();
		workLoad = inrepairlist.getWorkLoad();
		neededPart = inrepairlist.getNeededPart();
		serviceState = inrepairlist.getServiceState();
		
		
		
	    try
	    {
	        String sql = "Update REPAIRLIST SET WORKER = '"+worker+"',"
	                      +" INSPECTIONRECORD = '"+inspectionRecord+"',"+" SERVICERECORD = '"+serviceRecord+"',"
	        		      +" SERVICETIME = '"+serviceTime+"',"+" WORKLOAD = '"+workLoad+"',"+" NEEDEDPART = '"
	                      +neededPart+"',"+" SERVICESTATE = '"+serviceState+"'"+" WHERE SERVICEID="+serviceID;
	        pre = con.prepareStatement(sql);
	        pre.executeUpdate();
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
		
		
		
		
		
		
		

	}
	
	//鏍规嵁serviceID鎵惧埌瀵瑰簲琛屽垹闄�
	public static void del(String inserviceID)
	{
		try
	    {
	        String sql = "DELETE FROM REPAIRLIST "+"WHERE SERVICEID=" + inserviceID;
	        pre = con.prepareStatement(sql);
	        pre.executeUpdate();
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
		
		
		
		

	}
	
	//鏌ヨ鎵�湁
	public static ArrayList<RepairList> findall()
	{
		ArrayList<RepairList> list = new ArrayList<RepairList>();
		

	    try
	    {
	        String sql = "select * from REPAIRLIST";
	        pre = con.prepareStatement(sql);
	        rs = pre.executeQuery();
	        while (rs.next())
	        {
	        	serviceID = rs.getString("SERVICEID");
	        	worker = rs.getString("WORKER");
	        	inspectionRecord = rs.getString("INSPECTIONRECORD");
	        	serviceRecord = rs.getString("SERVICERECORD");
	        	serviceTime = rs.getString("SERVICETIME");
	        	workLoad = rs.getString("WORKLOAD");
	        	neededPart = rs.getString("NEEDEDPART");
	        	serviceState = rs.getInt("SERVICESTATE");
	        	
	        	RepairList repairlist = new RepairList(serviceID,worker,inspectionRecord,serviceRecord,serviceTime,workLoad,neededPart,serviceState);
	        	list.add(repairlist);
	        }
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }

		
		
		
		
		return list;
	}
}
