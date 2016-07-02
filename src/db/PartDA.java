package db;

import model.Part;

import java.sql.*;
import java.util.ArrayList;


public class PartDA{

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
	public static void add(Part inpart)
	{

	}
	
	//修改,通过partname和type找到要改的那行，然后修改
	public static void change(Part inpart)
	{

	}
	
	//查询,按partname，找到所有的行，返回那些行的type组成的数组
	public static ArrayList<String> findbyname(String inpartName)
	{
		ArrayList<String> list = new ArrayList<String>();
		return list;
	}
	
	//查询,按partname和type综合查询满足条件的那行
	public static Part findbytwo(String inpartName, String intype)
	{
		Part part = null;
		return part;
	}
	
	//查询所有
	public static ArrayList<Part> findall()
	{
		ArrayList<Part> list = new ArrayList<Part>();
		return list;
	}
}
