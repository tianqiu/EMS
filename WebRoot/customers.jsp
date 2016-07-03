<%@ page language="java" import="model.Customer" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>客户管理</title>
	<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
	<script src="js/layer.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="css/layer.css"/>
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


<div class = "info">
	<form id="myform">
		<div class = "contant">
		    <div class ="tips">
			<p style="margin-top:6px;padding:0;">   编号:</p>
			</div>
		<input type="text" placeholder="编号"  id="ID"><br>
	    </div>

		<div class = "contant">
			<div class ="tips">
			身份证:
			</div>
			<input type="text" placeholder="身份证" id="idID"><br>
		</div>
		
		<div class = "contant">
			<div class ="tips">
			    
			</div>
		<button class = "bt" type="submit" onclick="getcustomers()">查询</button>
	    </div>
	
	
	    <div class = "contant">
			<div class ="tips">
			</div>
		<button onclick="bbb()" class = "bt" type="submit">添加客户</button>
	    </div>

	</form>
</div>

<div class="none" style=" height:10px;border-bottom: 3px solid rgb(0,0,0);
  border-bottom-width: 1px;
  border-bottom-style: solid;">
  </div>




<%
int i;
ArrayList<Customer> list = (ArrayList<Customer>)session.getAttribute("customerList"); 
if(list != null)
{
	for(i = 0;i < list.size(); i++)
	{
		out.print("<div class=\"customer\">"
					+"<div class=\"customerblock\" id=\"" + list.get(i).getCustomerID() + "\">"
						+"<div class=\"customernum\">"+list.get(i).getCustomerID()+"</div>"
						+"<div class=\"customernum\"></div>"
						+"<div class=\"customeridnum\">" + list.get(i).getIdentificationID() + "</div>"
						+"<button class = \"change\" type=\"submit\" onclick=\"changebt(this)\">修改</button>"
						+"<button class = \"delete\" type=\"submit\" onclick=\"deletebt(this)\">删除</button>"
					+"</div>"
				+"</div>");
	}
}
%>



<div class="none"></div>
</body>
</html>

<script>
function getcustomers() {
	event.preventDefault();
    $.post("/EMS/GetCustomers",
	{
		CustomerID:$("#ID").val(),
		IdentificationID:$("#idID").val()
	},
	function(data,status){
      	location.reload()
    });	
}

function bbb() {
	event.preventDefault();
    location.href="customeradd.jsp";
}
function changebt(obj) {
	event.preventDefault();
	var pid = $(obj).parent().attr("id");

    $.post("/EMS/GetCustomer",
	{
		CustomerID:pid,
	},
	function(data,status){
      	location.href="customer.jsp";
    });	
}

function deletebt(obj) {
	event.preventDefault();
	var pid = $(obj).parent().attr("id");
	var is = confirm("确定要删除吗？");
	if(is == true)
	{
	    $.post("/EMS/DelCustomer",
		{
			CustomerID:pid,
		},
		function(data,status){
		    $.post("/EMS/GetCustomers",
			{
				CustomerID:"null",
				IdentificationID:"null"
			},
			function(data,status){
		      	location.reload()
		    });	
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