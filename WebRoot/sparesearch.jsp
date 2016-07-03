<%@ page language="java" import="model.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="wclassth=device-wclassth, initial-scale=1.0">
	<title>备件管理</title>
	<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
	<script src="js/layer.js" type="text/javascript"></script>
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
				备件名称
			</div>
			<div class="parttype" style="color:red">
				备件型号
			</div>
			<div class="partprice" style="color:red">
				备件价格
			</div>
			<div class="remainpart" style="color:red">
				剩余备件
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
				剩余1件
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
				<button class = "allot" type="submit" onclick="bbb()">出库</button>
			</div>
			<div class="enterbutton">
				<button class = "allot" type="submit" onclick="bbb()">入库</button>
			</div>
		</div>
		<div class="outenterbuttons">
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
				剩余1件
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
				<button class = "allot" type="submit" onclick="bbb()">出库</button>
			</div>
			<div class="enterbutton">
				<button class = "allot" type="submit" onclick="bbb()">入库</button>
			</div>
		</div>
		<div class="outenterbuttons">
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
				剩余1件
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
				<button class = "allot" type="submit" onclick="bbb()">出库</button>
			</div>
			<div class="enterbutton">
				<button class = "allot" type="submit" onclick="bbb()">入库</button>
			</div>
		</div>
		<div class="outenterbuttons">
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
				剩余1件
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
				<button class = "allot" type="submit" onclick="bbb()">出库</button>
			</div>
			<div class="enterbutton">
				<button class = "allot" type="submit" onclick="bbb()">入库</button>
			</div>
		</div>
		<div class="outenterbuttons">
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
				剩余1件
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
				<button class = "allot" type="submit" onclick="bbb()">出库</button>
			</div>
			<div class="enterbutton">
				<button class = "allot" type="submit" onclick="bbb()">入库</button>
			</div>
		</div>
		<div class="outenterbuttons">
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
				剩余1件
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
				<button class = "allot" type="submit" onclick="bbb()">出库</button>
			</div>
			<div class="enterbutton">
				<button class = "allot" type="submit" onclick="bbb()">入库</button>
			</div>
		</div>		
	</div>
</div>

	<div class="footer">
		<div class="none">
		</div>
		<div class="none">
		</div>

<div class="bill">
<table width="100%" border="1" cellspacing="0" cellpadding="1">
<tr>
<td colspan="7">备件流水明细</td>
</tr>
<tr>
<td width="14%">出库入库</td><td width="15%">备件名称</td><td width="14%">型号</td><td width="15%">维修编号</td><td width="14%">数量</td><td width="15%">单价</td><td width="13%">时间</td>
</tr>
<tr>
<td width="14%"></td><td width="15%" ></td><td width="14%"></td><td width="15%"></td><td width="14%"></td><td width="15%"></td><td width="13%"></td></tr>
<tr>
<td width="14%"></td><td width="15%" ></td><td width="14%"></td><td width="15%"></td><td width="14%"></td><td width="15%"></td><td width="13%"></td></tr>
<tr>
<td width="14%"></td><td width="15%" ></td><td width="14%"></td><td width="15%"></td><td width="14%"></td><td width="15%"></td><td width="13%"></td></tr>
<tr>
<td width="14%"></td><td width="15%" ></td><td width="14%"></td><td width="15%"></td><td width="14%"></td><td width="15%"></td><td width="13%"></td>
</tr>
</table>
<div class="none">
</div>
</div>

	</div>


</body>
</html>

<script>
function bbb() {
	prompt('输入数量：', 0);
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