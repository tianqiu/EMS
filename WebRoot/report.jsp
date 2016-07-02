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
			<form id="myform" action="servlet/Login" method="post">
				<div class = "contant">
				    <div class ="tips">
					<p style="margin-top:6px;padding:0;">   *客户编号:</p>
					</div>
				<input type="text" placeholder="客户编号" id="ID"><br>
			    </div>
				
				<div class = "contant">
					<div class ="tips">
					    *产品类型:
					</div>
					<select id="producttype">
						<option value=""></option>
 						<option value="1">台式机</option>
  						<option value="2">笔记本</option>
  						<option value="3">投影仪</option>
 						<option value="4">打印机</option>
						<option value="5">其他</option>
					</select><br>
				</div>
			
				<div class = "contant">
					<div class ="tips">
						机器品牌:
					</div>
					<input type="text" placeholder="机器品牌"><br>
				</div>
				
				<div class = "contant">
					<div class ="tips">
						机器型号:
					</div>
					<input type="text" placeholder="机器型号"><br>
				</div>
				
				<div class = "contant">
					<div class ="tips">
						缺少零件:
					</div>
					<input type="text" placeholder="缺少零件"><br>
				</div>

				<div class = "contant">
					<div class ="tips">
						系列号:
					</div>
					<input type="text" placeholder="系列号"><br>
				</div>

				<div class = "contant">
					<div class ="tips">
						*故障现象:
					</div>
					<input type="text" placeholder="故障现象" id="faultsymptom"><br>
				</div>

				<div class = "contant">
					<div class ="tips">
						*故障类型:
					</div>
					<select id="faulttype">
						<option value =''></option>
 						<option value ="1">固定性故障</option>
  						<option value ="2">间隙性故障</option>
					</select><br>
				</div>

				<div class = "contant">
					<div class ="tips">
						机器外观检查:
					</div>
					<input type="text" placeholder="机器外观检查" name="password" id="password"><br>
				</div>

				<div class = "contant">
					<div class ="tips">
						开机口令:
					</div>
					<input type="text" placeholder="开机口令" name="password" id="password"><br>
				</div>

				<div class = "contant">
					<div class ="tips">
						重要资料:
					</div>
					<input type="text" placeholder="重要资料" name="password" id="password"><br>
				</div>
				
				<div class = "contant">
					<div class ="tips">
						HDD:
					</div>
					<input type="text" placeholder="HDD" name="password" id="password"><br>
				</div>
				
				<div class = "contant">
					<div class ="tips">
						内存:
					</div>
					<input type="text" placeholder="内存" name="password" id="password"><br>
				</div>
				
				<div class = "contant">
					<div class ="tips">
						外置PC卡:
					</div>
					<input type="text" placeholder="外置PC卡" name="password" id="password"><br>
				</div>
				
				<div class = "contant">
					<div class ="tips">
						AC适配器:
					</div>
					<input type="text" placeholder="AC适配器" name="password" id="password"><br>
				</div>

				<div class = "contant">
					<div class ="tips">
						电池:
					</div>
					<input type="text" placeholder="电池" name="password" id="password"><br>
				</div>

				<div class = "contant">
					<div class ="tips">
						外接光驱:
					</div>
					<input type="text" placeholder="外接光驱" name="password" id="password"><br>
				</div>

				<div class = "contant">
					<div class ="tips">
						外接软驱:
					</div>
					<input type="text" placeholder="外接软驱" name="password" id="password"><br>
				</div>
 				
 				<div class = "contant">
					<div class ="tips">
						其他:
					</div>
					<input type="text"  name="password" id="password"><br>
				</div>

				<div class = "contant">
					<div class ="tips">
						报修时间:
					</div>
					<input type="text"  name="password" id="password"><br>
				</div>		

				<div class = "contant">
					<div class ="tips">
						预估价格:
					</div>
					<input type="text" placeholder="预估价格" name="password" id="password"><br>
				</div>

				<div class = "contant">
					<div class ="tips">
						报修状态:
					</div>
					<select>
						<option value=""></option>
 						<option value="0">未打印</option>
  						<option value="1">已打印</option>
						<option value="2">提交</option>
					</select><br>

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
    else if(document.getElementById('producttype').value == '')
        alert("产品类型不能为空！");
    else if(document.getElementById('faulttype').value == '')
        alert("故障类型不能为空！");
    else if(document.getElementById('faultsymptom').value == '')
        alert("故障现象不能为空！");
    else
    	location.href="print.jsp";
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