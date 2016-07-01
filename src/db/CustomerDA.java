package db;
import java.sql.*;


public class CustomerDA{

    static Connection con = null;
    static PreparedStatement pre = null;
    static ResultSet result = null;

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
            if (result != null)
                result.close();
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

	public static String findall()
	{
		String customerID = null;
	    try
	    {
	        String sql = "select * from CUSTOMER";
	        pre = con.prepareStatement(sql);
	        result = pre.executeQuery();
	        while (result.next())
	            customerID += result.getString("CUSTOMERID");
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    return customerID;
	}

}
