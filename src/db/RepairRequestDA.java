package db;

import model.RepairRequest;

import java.sql.*;
import java.util.ArrayList;


public class RepairRequestDA{

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
	public static void add(RepairRequest inrepairrequest)
	{

	}

	//查询
	public static RepairRequest find(String inserviceID)
	{
		RepairRequest repairrequest = null;
		return repairrequest;
	}	

	//修改，根据serviceID找到对应行进行修改
	public static void change(RepairRequest inrepairrequest)
	{

	}
	
	//根据serviceID找到对应行删除
	public static void del(String inserviceID)
	{

	}
}
