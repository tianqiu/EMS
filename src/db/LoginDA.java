package db;

import model.Loginer;
import model.PartTrack;

import java.sql.*;
import java.util.ArrayList;


public class LoginDA{

    static Connection con = null;
    static PreparedStatement pre = null;
    static ResultSet rs = null;
    
    
	static String loginID;
	static String password;
	static int type;//0是客服，1是技工
	static int state;//0是闲置，1是忙碌
	
	
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

	//查询所有
	public static ArrayList<Loginer> findall()
	{
		ArrayList<Loginer> list = new ArrayList<Loginer>();
		
		try
	    {
	        String sql = "select * from LOGINER";
	        pre = con.prepareStatement(sql);
	        rs = pre.executeQuery();
	        while (rs.next())
	        {    		    	   	    	    	         
	        	loginID=rs.getString("LOGINID");
	            password=rs.getString("PASSWORD");
	            type=rs.getInt("TYPE");
	            state=rs.getInt("STATE");
	        	
	            Loginer loginer = new Loginer(loginID,password,type,state);
	        	list.add(loginer);
	        }
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
		return list;
	}

	//查询所有技工
	public static ArrayList<Loginer> findallwoker()
	{
		ArrayList<Loginer> list = new ArrayList<Loginer>();
		
		try
	    {
	        String sql = "select * from LOGINER WHERE TYPE = 1";
	        pre = con.prepareStatement(sql);
	        rs = pre.executeQuery();
	        while (rs.next())
	        {    		    	   	    	    	         
	        	loginID=rs.getString("LOGINID");
	            password=rs.getString("PASSWORD");
	            type=rs.getInt("TYPE");
	            state=rs.getInt("STATE");
	        	
	            Loginer loginer = new Loginer(loginID,password,type,state);
	        	list.add(loginer);
	        }
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
		return list;
	}	

	public static Loginer find(String inloginID)
	{
		Loginer loginer = null;
		try
	    {
	        String sql = "select * from LOGINER WHERE LOGINID = '"+ inloginID +"'";
	        pre = con.prepareStatement(sql);
	        rs = pre.executeQuery();
	        if (rs.next())
	        {    		    	   	    	    	         
	        	loginID=rs.getString("LOGINID");
	            password=rs.getString("PASSWORD");
	            type=rs.getInt("TYPE");
	            state=rs.getInt("STATE");
	        	
	            loginer = new Loginer(loginID,password,type,state);
	        }
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
		return loginer;
	}
	
	public static void change(Loginer inloginer)
	{
		loginID = inloginer.getLoginID();
		password = inloginer.getPassword();
		type = inloginer.getType();
		state = inloginer.getState();

		try
	    {
			String sql = "Update LOGINER SET  PASSWORD = '"+password+"',"+" TYPE = '"+type+"',"+" STATE = '"
                    	 +state+"'" +" WHERE LOGINID="+loginID;
	        pre = con.prepareStatement(sql);
	        pre.executeUpdate();
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	}
	
	public static void changeState(String inloginID, int instate)
	{
		try
	    {
			String sql = "Update LOGINER SET  STATE = " + instate +" WHERE LOGINID = '"+inloginID+"'";
	        pre = con.prepareStatement(sql);
	        pre.executeUpdate();
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	}
}
