<%@ page language="java" import="model.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="wclassth=device-wclassth, initial-scale=1.0">
	<title>出库管理</title>
	<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="css/layer.css"/>
	<link rel="stylesheet" type="text/css" href="css/plug.css"/>
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
	<link rel="stylesheet" type="text/css" href="css/repair.css"/>
	<link rel="stylesheet" type="text/css" href="css/sparepart.css"/>
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

<div class="container">
	<div class="centerpart">
		<div class="outenterbuttons">
			<div class="partname" style="color:red">
				维修单号
			</div>
			<div class="partname" style="color:red">
				备件名称
			</div>
			<div class="parttype" style="color:red">
				备件型号
			</div>
			<div class="partprice" style="color:red">
				备件价格
			</div>
			<div class="remainpart" style="color:red">
				申请数量
			</div>
			<div class="entertime" style="color:red">
				入库时间
			</div>
			<div class="dangerousnumber" style="color:red">
				警戒数量
			</div>
			<div class="status" style="color:red">
				库存状态
			</div>
		</div>
		<div class="outenterbuttons">
			<div class="partname" style="color:red">
				1
			</div>
			<div class="partname">
				备件1
			</div>
			<div class="parttype">
				A型
			</div>
			<div class="partprice">
				1元
			</div>
			<div class="remainpart">
				1件
			</div>
			<div class="entertime">
				2016.6.28
			</div>
			<div class="dangerousnumber">
				2件
			</div>
			<div class="status">
				正常
			</div>
			<div class="outbutton">
				<button class = "allot" type="submit" >出库</button>
			</div>
		</div>
		<div class="outenterbuttons">
			<div class="partname" style="color:red">
				2
			</div>
			<div class="partname">
				备件1
			</div>
			<div class="parttype">
				B型
			</div>
			<div class="partprice">
				五毛
			</div>
			<div class="remainpart">
				1件
			</div>
			<div class="entertime">
				2016.6.28
			</div>
			<div class="dangerousnumber">
				2件
			</div>
			<div class="status">
				正常
			</div>
			<div class="outbutton">
				<button class = "allot" type="submit" >出库</button>
			</div>
		</div>
		<div class="outenterbuttons">
			<div class="partname" style="color:red">
				3
			</div>
			<div class="partname">
				备件2
			</div>
			<div class="parttype">
				A型
			</div>
			<div class="partprice">
				五毛
			</div>
			<div class="remainpart">
				1件
			</div>
			<div class="entertime">
				2016.6.28
			</div>
			<div class="dangerousnumber">
				2件
			</div>
			<div class="status">
				正常
			</div>
			<div class="outbutton">
				<button class = "allot" type="submit" >出库</button>
			</div>
		</div>
		<div class="outenterbuttons">
			<div class="partname" style="color:red">
				4
			</div>
			<div class="partname">
				备件2
			</div>
			<div class="parttype">
				B型
			</div>
			<div class="partprice">
				五毛
			</div>
			<div class="remainpart">
				1件
			</div>
			<div class="entertime">
				2016.6.28
			</div>
			<div class="dangerousnumber">
				2件
			</div>
			<div class="status">
				正常
			</div>
			<div class="outbutton">
				<button class = "allot" type="submit" >出库</button>
			</div>
		</div>
		<div class="outenterbuttons">
			<div class="partname" style="color:red">
				5
			</div>
			<div class="partname">
				备件3
			</div>
			<div class="parttype">
				A型
			</div>
			<div class="partprice">
				五毛
			</div>
			<div class="remainpart">
				1件
			</div>
			<div class="entertime">
				2016.6.28
			</div>
			<div class="dangerousnumber">
				2件
			</div>
			<div class="status">
				正常
			</div>
			<div class="outbutton">
				<button class = "allot" type="submit" >出库</button>
			</div>
		</div>
		<div class="outenterbuttons">
			<div class="partname" style="color:red">
				6
			</div>
			<div class="partname">
				备件3
			</div>
			<div class="parttype">
				B型
			</div>
			<div class="partprice">
				五毛
			</div>
			<div class="remainpart">
				1件
			</div>
			<div class="entertime">
				2016.6.28
			</div>
			<div class="dangerousnumber">
				2件
			</div>
			<div class="status">
				正常
			</div>
			<div class="outbutton">
				<button class = "allot" type="submit" >出库</button>
			</div>
		</div>		
	</div>
</div>


</body>
</html>

<script>
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