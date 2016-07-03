package db;

import model.Customer;

import java.sql.*;
import java.util.ArrayList;


public class CustomerDA{

    static Connection con = null;
    static PreparedStatement pre = null;
    static ResultSet rs = null;
    
    static String customerID;
    static String identificationID;
    static String deliverTime;
    static String customerNature;
    static String fixedPhone;
    static String unitName;
    static String mobilePhone;
    static String contacts;
    static String email;
    static String postCode;
    static String address;
    
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

	//添加客户
	public static boolean add(Customer incustomer)
	{
		boolean is;
		customerID = incustomer.getCustomerID();
		identificationID = incustomer.getIdentificationID();
		deliverTime = incustomer.getDeliverTime();
		customerNature = incustomer.getCustomerNature();
		fixedPhone = incustomer.getFixedPhone();
		unitName = incustomer.getUnitName();
		mobilePhone = incustomer.getMobilePhone();
		contacts = incustomer.getContacts();
		email = incustomer.getEmail();
		postCode = incustomer.getPostCode();
		address = incustomer.getAddress();
		
	    try
	    {
	        String sql = "INSERT INTO CUSTOMER (CUSTOMERID,IDENTIFICATIONID,DELIVERTIME,CUSTOMERNATURE,FIXEDPHONE,UNITNAME,MOBILEPHONE,CONTACTS,EMAIL,POSTCODE,ADDRESS) "
	                     +"VALUES ('"+customerID+"','"+identificationID+"','"+deliverTime+"','"+customerNature+"','"+fixedPhone+"','"+unitName+"','"+mobilePhone+"','"+contacts+"','"+email+"','"+postCode+"','"+address+"')";
	        pre = con.prepareStatement(sql);
	        pre.executeUpdate();
	        is = true;
	    }
	    catch (Exception e)
	    {
	    	is = false;
	        e.printStackTrace();
	    }
	    return is;
	}

	//修改客户
	public static void change(Customer incustomer)
	{
		customerID = incustomer.getCustomerID();
		identificationID = incustomer.getIdentificationID();
		deliverTime = incustomer.getDeliverTime();
		customerNature = incustomer.getCustomerNature();
		fixedPhone = incustomer.getFixedPhone();
		unitName = incustomer.getUnitName();
		mobilePhone = incustomer.getMobilePhone();
		contacts = incustomer.getContacts();
		email = incustomer.getEmail();
		postCode = incustomer.getPostCode();
		address = incustomer.getAddress();
		
	    try
	    {
	        String sql = "Update CUSTOMER SET IDENTIFICATIONID = '"+identificationID+"',"
	                      +" DELIVERTIME = '"+deliverTime+"',"+" CUSTOMERNATURE = '"+customerNature+"',"
	        		      +" FIXEDPHONE = '"+fixedPhone+"',"+" UNITNAME = '"+unitName+"',"+" MOBILEPHONE = '"
	                      +mobilePhone+"',"+" CONTACTS = '"+contacts+"',"+" EMAIL = '"+email+"',"+" POSTCODE = '"
	        		      +postCode+"',"+" ADDRESS = '"+address+"'"+" WHERE CUSTOMERID="+customerID;
	        pre = con.prepareStatement(sql);
	        pre.executeUpdate();
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	}	

	//删除客户
	public static void del(String incustomerID)
	{	
	    try
	    {
	        String sql = "DELETE FROM CUSTOMER "+"WHERE CUSTOMERID=" + incustomerID;
	        pre = con.prepareStatement(sql);
	        pre.executeUpdate();
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	}

	//根据客户编号查询
	public static ArrayList<Customer> findbyID(String incustomerID)
	{
		ArrayList<Customer> list = new ArrayList<Customer>();
	    try
	    {
	        String sql = "select * from CUSTOMER WHERE CUSTOMERID = '" + incustomerID +"'";
	        pre = con.prepareStatement(sql);
	        rs = pre.executeQuery();
	        while (rs.next())
	        {
	        	customerID = rs.getString("CUSTOMERID");
	        	identificationID = rs.getString("IDENTIFICATIONID");
	        	deliverTime = rs.getString("DELIVERTIME");
	        	customerNature = rs.getString("CUSTOMERNATURE");
	        	fixedPhone = rs.getString("FIXEDPHONE");
	        	unitName = rs.getString("UNITNAME");
	        	mobilePhone = rs.getString("MOBILEPHONE");
	        	contacts = rs.getString("CONTACTS");
	        	email = rs.getString("EMAIL");
	        	postCode = rs.getString("POSTCODE");
	        	address = rs.getString("ADDRESS");
	        	
	        	Customer customer = new Customer(customerID, identificationID, deliverTime, 
	        			                         customerNature, fixedPhone, unitName,
	        			                         mobilePhone, contacts, email,postCode,address);
	        	list.add(customer);
	        }
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    return list;
	}
	
	//根据身份证号查询
	public static ArrayList<Customer> findbyIDID(String inidentificationID)
	{
		ArrayList<Customer> list = new ArrayList<Customer>();
	    try
	    {
	        String sql = "select * from CUSTOMER WHERE IDENTIFICATIONID = '" + inidentificationID +"'";
	        pre = con.prepareStatement(sql);
	        rs = pre.executeQuery();
	        while (rs.next())
	        {
	        	customerID = rs.getString("CUSTOMERID");
	        	identificationID = rs.getString("IDENTIFICATIONID");
	        	deliverTime = rs.getString("DELIVERTIME");
	        	customerNature = rs.getString("CUSTOMERNATURE");
	        	fixedPhone = rs.getString("FIXEDPHONE");
	        	unitName = rs.getString("UNITNAME");
	        	mobilePhone = rs.getString("MOBILEPHONE");
	        	contacts = rs.getString("CONTACTS");
	        	email = rs.getString("EMAIL");
	        	postCode = rs.getString("POSTCODE");
	        	address = rs.getString("ADDRESS");
	        	
	        	Customer customer = new Customer(customerID, identificationID, deliverTime, 
	        			                         customerNature, fixedPhone, unitName,
	        			                         mobilePhone, contacts, email,postCode,address);
	        	list.add(customer);
	        }
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    return list;
	}
	
	//根据客户编号和身份证的结合查询
	public static ArrayList<Customer> findbytwo(String incustomerID, String inidentificationID)
	{
		ArrayList<Customer> list = new ArrayList<Customer>();
	    try
	    {
	        String sql = "select * from CUSTOMER WHERE IDENTIFICATIONID = '" + inidentificationID +"'"
	        		     + "AND CUSTOMERID = '" + incustomerID + "'";
	        pre = con.prepareStatement(sql);
	        rs = pre.executeQuery();
	        while (rs.next())
	        {
	        	customerID = rs.getString("CUSTOMERID");
	        	identificationID = rs.getString("IDENTIFICATIONID");
	        	deliverTime = rs.getString("DELIVERTIME");
	        	customerNature = rs.getString("CUSTOMERNATURE");
	        	fixedPhone = rs.getString("FIXEDPHONE");
	        	unitName = rs.getString("UNITNAME");
	        	mobilePhone = rs.getString("MOBILEPHONE");
	        	contacts = rs.getString("CONTACTS");
	        	email = rs.getString("EMAIL");
	        	postCode = rs.getString("POSTCODE");
	        	address = rs.getString("ADDRESS");
	        	
	        	Customer customer = new Customer(customerID, identificationID, deliverTime, 
	        			                         customerNature, fixedPhone, unitName,
	        			                         mobilePhone, contacts, email, postCode, address);
	        	list.add(customer);
	        }
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    return list;
	}
	//根据客户编号和身份证的结合查询
	public static ArrayList<Customer> findall()
	{
		ArrayList<Customer> list = new ArrayList<Customer>();
	    try
	    {
	        String sql = "select * from CUSTOMER";
	        pre = con.prepareStatement(sql);
	        rs = pre.executeQuery();
	        while (rs.next())
	        {
	        	customerID = rs.getString("CUSTOMERID");
	        	identificationID = rs.getString("IDENTIFICATIONID");
	        	deliverTime = rs.getString("DELIVERTIME");
	        	customerNature = rs.getString("CUSTOMERNATURE");
	        	fixedPhone = rs.getString("FIXEDPHONE");
	        	unitName = rs.getString("UNITNAME");
	        	mobilePhone = rs.getString("MOBILEPHONE");
	        	contacts = rs.getString("CONTACTS");
	        	email = rs.getString("EMAIL");
	        	postCode = rs.getString("POSTCODE");
	        	address = rs.getString("ADDRESS");
	        	
	        	Customer customer = new Customer(customerID, identificationID, deliverTime, 
	        			                         customerNature, fixedPhone, unitName,
	        			                         mobilePhone, contacts, email, postCode, address);
	        	list.add(customer);
	        }
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	    return list;
	}

}
