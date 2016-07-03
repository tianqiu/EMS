<%@ page language="java" import="model.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>打印结算清单</title>
	<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="css/plug.css"/>
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
	<link rel="stylesheet" type="text/css" href="css/printbill.css"/>
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


<div class="bill">
<table width="100%" border="1" cellspacing="0" cellpadding="1">
<tr>
<td colspan="8">XXX计算机服务有限公司结算清单XXX</td>
</tr>
<tr>
<td width="25%" colspan="2">维修单号</td><td width="25%" colspan="2">NO.02</td><td width="25%" colspan="2"></td><td width="25%" colspan="2"></td>
</tr>
<tr>
<td width="25%" colspan="2">接修日期</td><td width="25%" colspan="2"></td><td width="25%" colspan="2">修复日期</td><td width="25%" colspan="2"></td>
</tr>
<tr>
<td width="25%" colspan="2">产品类型</td><td width="25%" colspan="2"></td><td width="25%" colspan="2">机器品牌</td><td width="25%" colspan="2"></td>
</tr>
<tr>
<td width="25%" colspan="2">机器型号</td><td width="25%" colspan="2"></td><td width="25%" colspan="2">系列号</td><td width="25%" colspan="2"></td>
</tr>
<tr>
<td width="25%" colspan="2">单位名称</td><td width="25%" colspan="2"></td><td width="25%" colspan="2">联系人</td><td width="25%" colspan="2"></td>
</tr>
<tr>
<td width="25%" colspan="2">合计金额</td><td width="25%" colspan="2"></td><td width="12.5%">人工费</td><td width="12.5%"></td><td width="12.5%">材料费</td><td></td>
</tr>
<tr>
<td colspan="8">机器故障</td>
</tr>
<tr>
<td colspan="8" style="text-align:left;"><p>dsfasfasfasdf第三方士大夫撒旦法士大夫士大夫士大夫士大夫撒旦法撒旦法士大夫撒旦法多舒服撒地方撒旦法撒旦法士大夫盛大发售的方式大sadfsadf</p></td>
</tr>
<tr>
<td width="50%" colspan="4">保修承诺</td><td width="50%" colspan="4">注意事项</td>
</tr>
<tr>
<td width="50%" colspan="4"></td><td width="50%" colspan="4"></td>
</tr>
<tr>
<td width="25%" colspan="2">部件名称</td><td width="25%" colspan="2">型号</td><td width="25%" colspan="2">数量</td><td width="25%" colspan="2">单价</td>
</tr>
<tr>
<td width="25%" colspan="2"></td><td width="25%" colspan="2"></td><td width="25%" colspan="2"></td><td width="25%" colspan="2"></td>
</tr>
</table>
</div>
<button class = "sendbill" type="submit" onclick="bbb()">确 定</button>



<div class="none">
</div>
</body>
</html>

<script>
function bbb() {
	event.preventDefault();
    location.href="repair.jsp";
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