<%@ page language="java" import="db.*" import="model.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>维修管理</title>
	<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
	<script src="js/layer.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="css/layer.css"/>
	<link rel="stylesheet" type="text/css" href="css/plug.css"/>
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
	<link rel="stylesheet" type="text/css" href="css/customers.css"/>
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

<div class = "info">
			<form id="myform" >
				
				<div class = "contant">
					<div class ="tips">
					    请选择技工:
					</div>
					
<select id="producttype">
	<option value=""></option>					
<% 
db.LoginDA.initialize();
int i;
ArrayList<Loginer> list = LoginDA.findallwoker();
if(list != null)
{
	for(i = 0; i < list.size(); i++)
	{
		out.print("<option value=\""+ list.get(i).getLoginID() +"\">"+ list.get(i).getLoginID() +"</option>");
	}
}
db.LoginDA.terminate();
%>
</select>
					
					
						
				<br>
			</div>

			<div class = "contant">
		    	<div class ="tips">
		    	</div>
	        	<button class = "bt" type="submit" onclick="back()">提交</button>
           	</div>

		</form>
</div>
<div class="none">
</div>
</body>
</html>

<% 
String pid = request.getParameter("pid");
%>

<script>
window.onload=function()
{
	
}
function click1() {
event.preventDefault();
    location.href="distribution.jsp";
}
function click2() {
    event.preventDefault();
    location.href="check.jsp";
}
function click3() {
    event.preventDefault();
    location.href="settle.jsp";
}
function back(){
    event.preventDefault();
    alert($("#producttype").val());
  	$.post("/EMS/Distribute",
	{
		WorkerID:$("#producttype").val(),
		ServiceID:"<%=pid %>"
	},
	function(data,status){
      	location.href="repair.jsp";
    });
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