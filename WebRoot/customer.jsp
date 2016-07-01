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
			<p style="margin-top:6px;padding:0;">   姓名:</p>
			</div>
		<input type="text" placeholder="姓名"  ><br>
	    </div>

		<div class = "contant">
			<div class ="tips">
			*身份证:
			</div>
			<input type="text" placeholder="身份证" id="idnum"><br>
		</div>
		
		<div class = "contant">
			<div class ="tips">
			单位名称:
			</div>
			<input type="text" placeholder="单位名称 " ><br>
		</div>

		<div class = "contant">
			<div class ="tips">
			移动电话:
			</div>
			<input type="text" placeholder="电话" ><br>
		</div>
		
		<div class = "contant">
			<div class ="tips">
			座机:
			</div>
			<input type="text" placeholder="座机" ><br>
		</div>	

		<div class = "contant">
			<div class ="tips">
			地址:
			</div>
			<input type="text" placeholder="地址" ><br>
		</div>
		
		<div class = "contant">
			<div class ="tips">
			邮编:
			</div>
			<input type="text" placeholder="邮编" ><br>
		</div>

		<div class = "contant">
			<div class ="tips">
			E-mail:
			</div>
			<input type="text" placeholder="E-mail" ><br>
		</div>

		<div class = "contant">
			<div class ="tips">
			客户送机时间:
			</div>
			<input type="text" placeholder="客户送机时间" ><br>
		</div>

		<div class = "contant">
			<div class ="tips">
			客户性质:
			</div>
			<select>
				<option value ="volvo"></option>
				<option value ="volvo">家庭用户</option>
				<option value ="saab">单位用户</option>
  				<option value="opel">代理商</option>
 				<option value="audi">签约用户</option>
			</select>
			<br>
		</div>

	    <div class = "contant">
			<div class ="tips">
			</div>
		<button onclick="isnull()" class = "bt" type="submit">提交</button>
	    </div>

	</form>
</div>


<div class="none"></div>
</body>
</html>

<script>
function isnull() {
	event.preventDefault();
	if(document.getElementById('idnum').value == '')
    	alert("身份证不能为空！");
    else
    	location.href="customers.jsp";
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