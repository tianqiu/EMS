<%@ page language="java" import="model.*" import="java.util.*" contentType="text/html" pageEncoding="GBK"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>客户管理</title>
	<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="css/plug.css"/>
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
	<link rel="stylesheet" type="text/css" href="css/customers.css"/>
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


<div class = "info" style="height:auto">
	<form id="myform">
		<div class = "contant">
		    <div class ="tips">
			<p style="margin-top:6px;padding:0;">   备件名称</p>
			</div>
		<input type="text"   id="partName"><br>
	    </div>

		<div class = "contant">
			<div class ="tips">
			备件型号：
			</div>
			<input type="text"  id="partType"><br>
		</div>
		
		<div class = "contant">
			<div class ="tips">
			备件数量：
			</div>
			<input type="text" id="partNum"><br>
		</div>

		<div class = "contant">
			<div class ="tips">
			备件单价：
			</div>
			<input type="text" placeholder="单价" id="partPrice" ><br>
		</div>

	    <div class = "contant">
			<div class ="tips">
			</div>
		<button onclick="back()" class = "bt" type="submit">提交</button>
	    </div>

	</form>
</div>


<div class="none"></div>
</body>
</html>

<script>



function back() {
	event.preventDefault();
	if(document.getElementById('partName').value == '')
    	alert("备件名字不能为空！");
    else if(document.getElementById('partType').value == '')
    	alert("备件型号不能为空！");   
    else if(document.getElementById('partNum').Value=='')
    	alert("备件个数不能为空！");
    else if(document.getElementById('partPrice').Value=='')
    	alert("备件单价不能为空！");
   
  	else
    {		
	    $.post("/EMS/AddPart",
		{
			PartName:$("#partName").val(),
			PartType:$("#partType").val(),
			PartNum:$("#partNum").val(),
			PartPrice:$("#partPrice").val()	
		},
		function(data,status){
	      	location.href="sparepart.jsp";
	    });	
    }
	
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