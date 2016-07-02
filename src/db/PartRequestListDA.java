package db;

import model.PartRequestList;

import java.sql.*;
import java.util.ArrayList;


public class PartRequestListDA{

    static Connection con = null;
    static PreparedStatement pre = null;
    static ResultSet rs = null;
    
    
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
	public static void add(PartRequestList inpartrequestlist)
	{

	}

	//删除
	public static void del(String inserviceID)
	{

	}	

	//查询所有
	public static ArrayList<PartRequestList> findall()
	{
		ArrayList<PartRequestList> list = new ArrayList<PartRequestList>();
		return list;
	}
}
