<%@ page language="java" import="db.*" import="model.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>维修管理</title>
	<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
	<script src="js/jquery-session.js" type="text/javascript"></script>
	<script src="js/layer.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="css/layer.css"/>
	<link rel="stylesheet" type="text/css" href="css/plug.css"/>
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
	<link rel="stylesheet" type="text/css" href="css/repair.css"/>
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

<div class="repair" id="repair">
	<div class="repairblock">
	<div class="repairstat" style="color:red;padding-left:40px">维修编号</div>
    <div class="repairstat" style="color:red;margin-left:88px"><p>维修状态</p></div>
	</div>
</div>

<% 
int i;
String state = null;
int serviceState;
RepairListDA.initialize();
ArrayList<RepairList> list = RepairListDA.findall(); 
RepairListDA.terminate();
if(list != null)
{
	for(i = 0;i < list.size(); i++)
	{
		serviceState = list.get(i).getServiceState();
		if(serviceState == 0)
			state = "未分配";
		else if(serviceState == 1)
			state = "分配未检测";
		else if(serviceState == 2)
			state = "检测完成维修未完成";
		else if(serviceState == 3)
			state = "维修完成";
		out.print("<div class=\"repair\" id=\"repair\">"
					+"<div class=\"repairblock\">"
					+"<div class=\"repairnum\">" + list.get(i).getServiceID() + "</div>"
				    +"<div class=\"repairstat\"><p>" + state + "</p></div>"
					+"</div>"
				    +"<div class=\"repairbuttons\" id = \"" + list.get(i).getServiceID() + "\">"
				    +"<button class = \"allot\" type=\"submit\" onclick=\"click1(this)\">分配</button>"
					+"<button class = \"check\" type=\"submit\" onclick=\"click2(this)\">检测</button>"
					+"<button class = \"cal\" type=\"submit\" onclick=\"click3(this)\">结算</button>"
					+"</div>"
				+"</div>");
	}
}
%>

<div class="none"></div>
</body>
</html>

<script>
window.onload=function()
{
	type = "${sessionScope.loginer.type}";
}
function click1(obj) {
event.preventDefault();
	if(type == '0')
	{
		var pid = $(obj).parent().attr("id");
		
		location.href="distribution.jsp?pid="+pid;
	}
    else if(type == '1')
    {
    	alert("你没有分配的权限！");
	}
	else
		alert("请先登录");
}
function click2(obj) {
    event.preventDefault();
    if(type == '1')
	{
		var pid = $(obj).parent().attr("id");
		var workerID = "${sessionScope.loginer.loginID}";
	  	$.post("/EMS/Check",
		{
			ServiceID:pid,
			WorkerID:workerID
		},
		function(data,status){
			if(data == "y")
	      		location.href="check.jsp";
	      	else
	      		alert("这个任务没有分配给你！");
	    });
	}
    else if(type == '0')
    	alert("你没有检测的权限！");
    else
    	alert("请先登录");
}
function click3(obj) {
    event.preventDefault();
	if(type == 0)
	{
		location.href="settle.jsp";
	}
    else
    	alert("你没有分配的权限！");
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