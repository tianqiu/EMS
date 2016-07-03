<%@ page language="java" import="model.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>结算登记</title>
	<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="css/plug.css"/>
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
	<link rel="stylesheet" type="text/css" href="css/customers.css"/>
	<link rel="stylesheet" type="text/css" href="css/settle.css"/>
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
			<form id="myform" action="servlet/Login" method="post">
				<div class = "contant">
				    <div class ="tips">
					<p style="margin-top:6px;padding:0;">   *维修编号:</p>
					</div>
				<input type="text" placeholder="维修编号" id="ID"><br>
			    </div>

				<div class = "contant">
					<div class ="tips">
						*维修费用:
					</div>
					<input type="text" placeholder="维修费用" id="laborcost"><br>
				</div>
				
				<div class = "contant">
					<div class ="tips">
						*材料费用:
					</div>
					<input type="text" placeholder="材料费用" id='materialcost'><br>
				</div>

				<div class = "contant">
					<div class ="tips">
						保修承诺:
					</div>
					<input type="text" placeholder="保修承诺"><br>
				</div>

				<div class = "contant">
					<div class ="tips">
						注意事项:
					</div>
					<input type="text" placeholder="注意事项"><br>
				</div>

               <div class = "contant">
			    <div class ="tips">
			    </div>
		        <button class = "bt" type="submit" onclick="isnull()">提交</button>
	           </div>


			</form>
</div>






<div class="none">
</div>
</body>
</html>

<script>
function isnull() {
event.preventDefault();
if(document.getElementById('ID').value == '')
    alert("维修编号不能为空！");
else if(document.getElementById('laborcost').value == '')
    alert("维修费用不能为空！");
else if(document.getElementById('materialcost').value == '')
    alert("材料费用不能为空！");
else
    location.href="printbill.jsp";
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