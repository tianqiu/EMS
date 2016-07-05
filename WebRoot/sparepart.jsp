<%@ page language="java" import="model.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>报修管理</title>
	<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="css/plug.css"/>
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
	<link rel="stylesheet" type="text/css" href="css/customers.css"/>
	<link rel="stylesheet" type="text/css" href="css/report.css"/>
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
			<form id="myform">

			   <div class = "contant">
			    <div class ="tips">
			    </div>
		        <button class = "bt" type="submit" onclick="enterit()">备件入库</button>
	           </div>

	           <div class = "contant">
			    <div class ="tips">
			    </div>
		        <button class = "bt" type="submit" onclick="out()">备件出库</button>
	           </div>

	           <div class = "contant">
			    <div class ="tips">
			    </div>
		        <button class = "bt" type="submit" onclick="manage()">备件管理</button>
	           </div>

			   <div class = "contant">
			    <div class ="tips">
			    </div>
		        <button class = "bt" type="submit" onclick="sparetable()">备件流水明细</button>
	           </div>
				


			</form>
</div>






<div class="none">
</div>
</body>
</html>

<script>
function enterit(){
	event.preventDefault();
	location.href="enter.jsp";
}
function out() {
	event.preventDefault();
    location.href="spareout.jsp";
}
function sparetable(){
	event.preventDefault();
	location.href="sparetable.jsp";
    $.post("/EMS/GetParts",
	{
	},
	function(data,status){
   	location.href="sparetable.jsp";
    });
}
function manage(){
	event.preventDefault();
    $.post("/EMS/GetParts",
	{
	},
	function(data,status){
   		location.href="spareenter.jsp";
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