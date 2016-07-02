package db;

import model.RepairRequest;

import java.sql.*;

public class RepairRequestDA{

    static Connection con = null;
    static PreparedStatement pre = null;
    static ResultSet rs = null;
    
    static	String serviceID;
	static	String customerID;
	static	int productType;
	static	String machineBrand;
	static	String machineType;
	static	String serialNumber;
	static	String lackPart;
	static	String machineFailPhenomena;
	static	String machineAttachCheck;
	static	String passWord;
	static	String importantInfo;
	static	String HDD;
	static	String internalStorage;
	static	int failType;
	static	String outPCCard;
	static	String ACAdapter;
	static	String battery;
	static	String externalCDROM;
	static	String externalSoftDrive;
	static	String others;
	static	String repairTime;
	static	int estimatedPrice;
	static	int repairState;
    
	//连接数据库
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
	public static boolean add(RepairRequest inrepairrequest)
	{
		boolean is;
		serviceID = inrepairrequest.getServiceID();
		customerID = inrepairrequest.getCustomerID();
		productType = inrepairrequest.getProductType();
		machineBrand = inrepairrequest.getMachineBrand();
		machineType = inrepairrequest.getMachineType();
		serialNumber = inrepairrequest.getSerialNumber();
		lackPart = inrepairrequest.getLackPart();
		machineFailPhenomena = inrepairrequest.getMachineFailPhenomena();
		machineAttachCheck = inrepairrequest.getMachineAttachCheck();
		passWord = inrepairrequest.getPassWord();
		importantInfo = inrepairrequest.getImportantInfo();
		HDD = inrepairrequest.getHDD();
		internalStorage = inrepairrequest.getInternalStorage();
		failType = inrepairrequest.getFailType();
		outPCCard = inrepairrequest.getOutPCCard();
		ACAdapter = inrepairrequest.getACAdapter();
		battery = inrepairrequest.getBattery();
		externalCDROM = inrepairrequest.getExternalCDROM();
		externalSoftDrive = inrepairrequest.getExternalSoftDrive();
		others = inrepairrequest.getOthers();
		repairTime = inrepairrequest.getRepairTime();
		estimatedPrice = inrepairrequest.getEstimatedPrice();
		repairState = inrepairrequest.getRepairState();
	
		try{
			String sql = "INSERT INTO REPAIRREQUEST (SERVICEID,CUSTOMERID,PRODUCTTYPE,MACHINEBRAND,MACHINETYPE,SERIALNUMBER,LACKPART,MACHINEFAILPHENOMENA,MACHINEATTACHCHECK,PASSWORD,IMPORTANTINFO,HDD,INTERNALSTORAGE,FAILTYPE,OUTPCCARD,ACADAPTER,BATTERY,EXTERNALCDROM,EXTERNALSOFTDRIVE,OTHERS,REPAIRTIME,ESTIMATEDPRICE,REPAIRSTATE) "
                    +"VALUES ('"+serviceID+"','"+customerID+"','"+productType+"','"+machineBrand+"','"+machineType+"','"+serialNumber+"','"+lackPart+"','"+machineFailPhenomena+"','"+machineAttachCheck+"','"+passWord+"','"+importantInfo+"','"+HDD+"','"+internalStorage+"','"+failType+"','"+outPCCard+"','"+ACAdapter+"','"+battery+"','"+externalCDROM+"','"+externalSoftDrive+"','"+others+"','"+repairTime+"','"+estimatedPrice+"','"+repairState+"')";
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

	//查询
	public static RepairRequest find(String inserviceID)
	{
		RepairRequest repairrequest = null;
		try
		{
			String sql = "select * from REPAIRREQUEST WHERE SERVICEID = '" + inserviceID + "'";
			pre = con.prepareStatement(sql);
			rs = pre.executeQuery();
			if(rs.next())
			{
				serviceID = rs.getString("SERVICEID");
				customerID = rs.getString("CUSTOMERID");
				productType = rs.getInt("PRODUCTTYPE");
				machineBrand = rs.getString("MACHINEBRAND");
				machineType = rs.getString("MACHINETYPE");
				serialNumber = rs.getString("SERIALNUMBER");
				lackPart = rs.getString("LACKPART");
				machineFailPhenomena = rs.getString("MACHINEFAILPHENOMENA");
				machineAttachCheck = rs.getString("MACHINEATTACHCHECK");
				passWord = rs.getString("PASSWORD");
				importantInfo = rs.getString("IMPORTANTINFO");
				HDD = rs.getString("HDD");
				internalStorage = rs.getString("INTERNALSTORAGE");
				failType = rs.getInt("FAILTYPE");
				outPCCard = rs.getString("OUTPCCARD");
				ACAdapter = rs.getString("ACADAPTER");
				battery = rs.getString("BATTERY");
				externalCDROM = rs.getString("EXTERNALCDROM");
				externalSoftDrive = rs.getString("EXTERNALSOFTDRIVE");
				others = rs.getString("OTHERS");
				repairTime = rs.getString("REPAIRTIME");
				estimatedPrice = rs.getInt("ESTIMATEDPRICE");
				repairState = rs.getInt("REPAIRSTATE");
				repairrequest = new RepairRequest(serviceID,customerID,productType,machineBrand,machineType,serialNumber,lackPart,machineFailPhenomena,machineAttachCheck,passWord,importantInfo,HDD,
						internalStorage,failType,outPCCard,ACAdapter,battery,externalCDROM,externalSoftDrive,others,repairTime,estimatedPrice,repairState);

			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return repairrequest;
	}	

	//修改，根据serviceID找到对应行进行修改
	public static void change(RepairRequest inrepairrequest)
	{
		serviceID = inrepairrequest.getServiceID();
		customerID = inrepairrequest.getCustomerID();
		productType = inrepairrequest.getProductType();
		machineBrand = inrepairrequest.getMachineBrand();
		machineType = inrepairrequest.getMachineType();
		serialNumber = inrepairrequest.getSerialNumber();
		lackPart = inrepairrequest.getLackPart();
		machineFailPhenomena = inrepairrequest.getMachineFailPhenomena();
		machineAttachCheck = inrepairrequest.getMachineAttachCheck();
		passWord = inrepairrequest.getPassWord();
		importantInfo = inrepairrequest.getImportantInfo();
		HDD = inrepairrequest.getHDD();
		internalStorage = inrepairrequest.getInternalStorage();
		failType = inrepairrequest.getFailType();
		outPCCard = inrepairrequest.getOutPCCard();
		ACAdapter = inrepairrequest.getACAdapter();
		battery = inrepairrequest.getBattery();
		externalCDROM = inrepairrequest.getExternalCDROM();
		externalSoftDrive = inrepairrequest.getExternalSoftDrive();
		others = inrepairrequest.getOthers();
		repairTime = inrepairrequest.getRepairTime();
		estimatedPrice = inrepairrequest.getEstimatedPrice();
		repairState = inrepairrequest.getRepairState();
		
		try{
			String sql = "Update REPAIRREQUEST SET CUSTOMERID = '"+customerID+"',"
                    +" PRODUCTTYPE = '"+productType+"',"+" MACHINEBRAND = '"+machineBrand+"',"
      		      +" MACHINETYPE = '"+machineType+"',"+" SERIALNUMBER = '"+serialNumber+"',"+" LACKPART = '"
                    +lackPart+"',"+" MACHINEFAILPHENOMENA = '"+machineFailPhenomena	+"'"+" MACHINEATTACHCHECK = '"+machineAttachCheck+"'"+" PASSWORD = '"+passWord+"',"+" IMPORTANTINFO = '"+importantInfo+"',"+" HDD = '"+HDD+"',"+" INTERNALSTORAGE = '"+internalStorage+"',"+" FAILTYPE = '"+failType+"',"+" OUTPCCARD = '"+outPCCard+"',"+" ACADAPTER = '"+ACAdapter+"',"+" BATTERY = '"+battery+"',"+" EXTERNALCDROM = '"+externalCDROM+"',"+" EXTERNALSOFTDRIVE = '"+externalSoftDrive+"',"+" OTHERS = '"+others+"',"+" REPAIRTIME = '"+repairTime+"',"+" ESTIMATEDPRICE = '"+estimatedPrice+"',"+" REPAIRSTATE = '"+repairState+"',"+" WHERE SERVICEID="+serviceID;
			pre = con.prepareStatement(sql);
			pre.executeUpdate();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	//根据serviceID找到对应行删除
	public static void del(String inserviceID)
	{
		try
		{
			 String sql = "DELETE FROM REPAIRREQUEST "+"WHERE SERVICEID=" + inserviceID;
		        pre = con.prepareStatement(sql);
		        pre.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
