package db;

import model.Part;
import model.RepairList;

import java.sql.*;
import java.util.ArrayList;


public class RepairListDA{

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
	public static void add(RepairList inrepairlist)
	{

	}

	//查询
	public static RepairList find(String inserviceID)
	{
		RepairList repairlist = null;
		return repairlist;
	}	

	//修改，根据serviceID找到对应行进行修改
	public static void change(RepairList inrepairlist)
	{

	}
	
	//根据serviceID找到对应行删除
	public static void del(String inserviceID)
	{

	}
	
	//查询所有
	public static ArrayList<RepairList> findall()
	{
		ArrayList<RepairList> list = new ArrayList<RepairList>();
		return list;
	}
}
