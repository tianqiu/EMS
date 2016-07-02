package db;

import model.Checkout;

import java.sql.*;
import java.util.ArrayList;


public class CheckoutDA{

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
	public static void add(Checkout incheckout)
	{

	}

	//删除
	public static void del(String serviceID)
	{	

	}

	//查询，根据serviceID来查询
	public static Checkout find(String inserviceID)
	{
		Checkout checkout = null;
		return checkout;
	}
}
