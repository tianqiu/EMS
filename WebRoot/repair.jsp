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
<div class="repair" id="repair">
	<div class="repairblock">
	<div class="repairnum">01</div>
    <div class="repairstat"><p>未分配</p></div>
	</div>
    <div class="repairbuttons">
    <button class = "allot" type="submit" onclick="click1()">分配</button>
	<button class = "check" type="submit" onclick="click2()">检测</button>
	<button class = "cal" type="submit" onclick="click3()">结算</button>
	</div>
</div>
<div class="repair" id="repair">
	<div class="repairblock">
	<div class="repairnum">02</div>
    <div class="repairstat"><p>未分配</p></div>
	</div>
    <div class="repairbuttons">
    <button class = "allot" type="submit" >分配</button>
	<button class = "check" type="submit" >检测</button>
	<button class = "cal" type="submit" >结算</button>
	</div>
</div>
<div class="repair" id="repair">
	<div class="repairblock">
	<div class="repairnum">03</div>
    <div class="repairstat"><p>分配但未检测</p></div>
	</div>
    <div class="repairbuttons">
    <button class = "allot" type="submit" >分配</button>
	<button class = "check" type="submit" >检测</button>
	<button class = "cal" type="submit" >结算</button>
	</div>
</div>
<div class="repair" id="repair">
	<div class="repairblock">
	<div class="repairnum">04</div>
    <div class="repairstat"><p>检测但未完成维修</p></div>
	</div>

    <div class="repairbuttons">
    <button class = "allot" type="submit" >分配</button>
	<button class = "check" type="submit" >检测</button>
	<button class = "cal" type="submit" >结算</button>
	</div>

</div>
<div class="repair" id="repair">
	<div class="repairblock">
	<div class="repairnum">05</div>
        <div class="repairstat">
        <p>维修完成</p>
        </div>
	</div>
	<div class="repairbuttons">
    <button class = "allot" type="submit" >分配</button>
	<button class = "check" type="submit" >检测</button>
	<button class = "cal" type="submit" >结算</button>
	</div>
</div>

<div class="none">
</div>
</body>
</html>

<script>
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