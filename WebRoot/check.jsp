<%@ page language="java" import="model.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>技工检测</title>
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



<%
String serviceID = "";
String worker = "";
String inspectionRecord = "";
String serviceRecord = "";
String serviceTime = "";
String workLoad = "";
String neededPart = "";

RepairList repairList = (RepairList)session.getAttribute("check"); 
if(repairList != null)
{
	serviceID = repairList.getServiceID();
	worker = repairList.getWorker();
	inspectionRecord = repairList.getInspectionRecord();
	serviceRecord = repairList.getServiceRecord();
	serviceTime = repairList.getServiceTime();
	workLoad = repairList.getWorkLoad();
	neededPart = repairList.getNeededPart();
}
%>
<center><h2>技工你好，你已经接受了维修任务，可以对其进行维护。</h2></center>
<div class = "info">
			<form method="post">
				<div class = "contant">
				    <div class ="tips">
					<p style="margin-top:6px;padding:0;">   *维修编号:</p>
					</div>
				<input type="text" placeholder="维修编号" name="ID" id="ID" readonly="true" value="<%=serviceID %>"><br>
			    </div>
			
				<div class = "contant">
					<div class ="tips">
						维修人员:
					</div>
					<input type="text" placeholder="维修人员" readonly="true" id="workerID" value="<%=worker %>"><br>
				</div>
				
				<div class = "contant">
					<div class ="tips">
						检测记录:
					</div>
					<input type="text" placeholder="检测记录" id="inspectionRecord" value="<%=inspectionRecord %>"><br>
				</div>
				<div class = "contant">
					<div class ="tips">
						维修记录:
					</div>
					<input type="text" placeholder="维修记录" id="serviceRecord" value="<%=serviceRecord %>"><br>
				</div>
				<div class = "contant">
					<div class ="tips">
						维修检测时间:
					</div>
					<input type="text" placeholder="维修检测时间" id="serviceTime" value="<%=serviceTime %>"><br>
				</div>
				<div class = "contant">
					<div class ="tips">
						工作量:
					</div>
					<input type="text" placeholder="维修检测时间" id="workLoad" value="<%=workLoad %>"><br>
				</div>
				</br>
<center><h2>请输入需要的配件数量</h2></center>

				<div class = "contant">
					<div class ="tips">
						备件名称:
					</div>
					<input type="text" placeholder="备件名称" id="partName"><br>
				</div>
				<div class = "contant">
					<div class ="tips">
						备件型号:
					</div>
					<input type="text" placeholder="备件型号" id="partType"><br>
				</div>
				<div class = "contant">
					<div class ="tips">
						数量:
					</div>
					<input type="text" placeholder="数量" id="pNum"><br>
				</div>


               <div class = "contant">
			    <div class ="tips">
			    </div>
		        <button class = "bt" type="submit" onclick="isnull()">提交修改</button>
	           </div>

               <div class = "contant">
			    <div class ="tips">
			    </div>
		        <button class = "bt" type="submit" onclick="done()">已完成任务</button>
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
    else
    {
		$.post("/EMS/ChangeCheck",
		{
			ServiceID:$("#ID").val(),
			Worker:$("#workerID").val(),
			InspectionRecord:$("#inspectionRecord").val(),
			ServiceRecord:$("#serviceRecord").val(),
			ServiceTime:$("#serviceTime").val(),
			WorkLoad:$("#workLoad").val(),
			PartName:$("#partName").val(),
			PartType:$("#partType").val(),
			PartNum:$("#pNum").val(),
		},
		function(data,status){
	      	location.href="repair.jsp";
	    });	
	}
}
function done() {
	event.preventDefault();
	if(document.getElementById('ID').value == '')
    	alert("维修编号不能为空！");
    else
    {
		$.post("/EMS/DoneCheck",
		{
			ServiceID:$("#ID").val(),
			WorkerID:$("#workerID").val(),
		},
		function(data,status){
	      	location.href="repair.jsp";
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