<%@ page language="java" import="model.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>打印报修信息</title>
	<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="css/plug.css"/>
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
	<link rel="stylesheet" type="text/css" href="css/print.css"/>
</head>
<body>
<div class="none">
</div>
<div class="header">
	<img class="img1" src="images/group23.jpg"></img>
	<div class="buttons">
		<ul>
			<li>
				<a class="aa" href="login.jsp" onmouseenter="aenter(this)" onmouseleave="aleave(this)">登录</a>
			</li>
			<li>
				<a class="aa" href="customers.jsp" onmouseenter="aenter(this)" onmouseleave="aleave(this)">客户管理</a>
			</li>
			<li>
				<a class="aa" href="report.jsp" onmouseenter="aenter(this)" onmouseleave="aleave(this)">报修管理</a>
			</li>
			<li>
				<a class="aa" href="repair.jsp" onmouseenter="aenter(this)" onmouseleave="aleave(this)">维修管理</a>
			</li>
			<li>
				<a class="aa" href="sparepart.jsp" onmouseenter="aenter(this)" onmouseleave="aleave(this)">备件管理</a>
			</li>
		</ul>
	</div>
</div>
<div class="none">
</div>

<%
String serviceID = "";
String customerID = "";
int productType = 0;
String machineBrand = "";
String machineType = "";
String serialNumber = "";
String lackPart = "";
String machineFailPhenomena = "";
String machineAttachCheck = "";
String passWord = "";
String importantInfo = "";
String HDD = "";
String internalStorage = "";
int failType = 0;
String outPCCard = "";
String acAdapter = "";
String battery = "";
String externalCDROM = "";
String externalSoftDrive = "";
String others = "";
String repairTime = "";
int estimatedPrice = 0;
int repairState = 0;
String unitName = "";
String contacts = "";
String stProductType ="";
String stFailType = "";
String stRepairState = "";

RepairRequest repairrequest = (RepairRequest)session.getAttribute("repairRequest"); 
if(repairrequest != null)
{
	serviceID = repairrequest.getServiceID();
	customerID = repairrequest.getCustomerID();
	productType = repairrequest.getProductType();
	machineBrand = repairrequest.getMachineBrand();
	machineType = repairrequest.getMachineType();
	serialNumber = repairrequest.getSerialNumber();
	lackPart = repairrequest.getLackPart();
	machineFailPhenomena = repairrequest.getMachineFailPhenomena();
	machineAttachCheck = repairrequest.getMachineAttachCheck();
	passWord = repairrequest.getPassWord();
	importantInfo = repairrequest.getImportantInfo();
	HDD = repairrequest.getHDD();
	internalStorage = repairrequest.getInternalStorage();
	failType = repairrequest.getFailType();
	outPCCard = repairrequest.getOutPCCard();
	acAdapter = repairrequest.getACAdapter();
	battery = repairrequest.getBattery();
	externalCDROM = repairrequest.getExternalCDROM();
	externalSoftDrive = repairrequest.getExternalSoftDrive();
	others = repairrequest.getOthers();
	repairTime = repairrequest.getRepairTime();
	estimatedPrice = repairrequest.getEstimatedPrice();
	repairState = repairrequest.getRepairState();
	
	db.CustomerDA.initialize();
	ArrayList<Customer> a = db.CustomerDA.findbyID(customerID);	
	unitName = a.get(0).getUnitName();
	contacts = a.get(0).getContacts();
	db.CustomerDA.terminate();

	stFailType = String.valueOf(failType);
	stRepairState = String.valueOf(repairState);

	if(productType == 1)
		stProductType = "台式机";
	else if(productType == 2)
		stProductType = "笔记本";
	else if(productType == 3)
		stProductType = "投影仪";
	else if(productType == 4)
		stProductType = "打印机";
	else if(productType == 5)
		stProductType = "其他";
	else
		stProductType = " ";
	
	if(failType == 1)
		stFailType = "固定性故障";
	else if(failType == 2)
		stFailType = "间隙性故障";
	else
		stFailType = " ";
	
	if(repairState == 1)
		stRepairState = "未打印";
	else if(repairState == 2)
		stRepairState = "已打印";
	else if(repairState == 3)
		stRepairState = "提交";
	else
		stRepairState = " ";

}
%>

<div class="bill">
<table width="100%" border="1" cellspacing="0" cellpadding="1">
<tr>
<td colspan="4">XXX计算机服务有限公司结算清单XXX</td>
</tr>
<tr>
<td width="25%">接修日期</td><td width="25%"><%=repairTime %></td><td width="25%">维修编号</td><td width="25%"><%=serviceID %></td>
</tr>
<tr>
<td width="25%">产品类型</td><td width="25%"><%=stProductType %></td><td width="25%">机器品牌</td><td width="25%"><%=machineBrand %></td>
</tr>
<tr>
<td width="25%">机器型号</td><td width="25%"><%=machineType %></td><td width="25%">系列号</td><td width="25%"><%=serialNumber %></td>
</tr>
<tr>
<td width="25%">单位名称</td><td width="25%"><%=unitName %></td><td width="25%">联系人</td><td width="25%"><%=contacts %></td>
</tr>
<tr>
<td colspan="4">机器故障</td>
</tr>
<tr>
<td colspan="4" style="text-align:left;"><p><%=machineFailPhenomena %></p></td>
</tr>
<tr>
<td width="50%" colspan="2">缺少零件</td><td width="50%" colspan="2">随机附件</td>
</tr>
<tr>
<td width="50%" colspan="2"><%=lackPart %></td><td width="50%" colspan="2"><%=importantInfo %></td>
</tr>
</table>
</div>
<button onclick="bbb()" class = "sendbill" type="submit" >确 定</button>



<div class="none">
</div>
</body>
</html>

<script>
function bbb() {
	event.preventDefault();
    location.href="report.jsp";
}
function enter(x) {
    x.style.opacity = "0.5";
}
function leave(x) {
   	x.style.opacity = "1";
}
function aenter(x) {
    x.style.color = "white";
}
function aleave(x) {
   	x.style.color = "rgb(129,129,129)";
}
</script>