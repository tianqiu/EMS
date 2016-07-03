<%@ page language="java" import="model.*" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="css/login.css">
</head>

<body>

<div class="htmleaf-container">
	<div class="wrapper">
		<div class="container">
			<br><br><br><br><h1>Welcome</h1>
			
			<form  class="form" id="myform" action="servlet/Login" method="post">
				<input type="text" placeholder="ID" id="ID">
				<input type="password" placeholder="Password" id="password">
				<br><button type="submit" id="login-button">Login</button>
			</form>
		</div>
		
		<ul class="bg-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
</div>

<div align="left"><script src="js/jquery-2.1.1.min.js" type="text/javascript"></script> </div>

<script>
$('#login-button').click(function (event) {
	event.preventDefault();
	if(document.getElementById('ID').value == '')
    	alert("账号不能为空！");
    else if(document.getElementById('password').value == '')
    	alert("密码不能为空");
    else
    {
    	$('form').fadeOut(500);
		$('.wrapper').addClass('form-success');
		//alert("${sessionScope.student.ID}");
		setTimeout(function(){location.href="customers.jsp";},1000);
    }


	
/*	    
	$.post("Login",
    {
      ID:$("#ID").val(),
      password:$("#password").val()
    },
    function(data,status){
    	if(data == "y")
    	{
    		$('form').fadeOut(500);
			$('.wrapper').addClass('form-success');
			//alert("${sessionScope.student.ID}");
			setTimeout(function(){location.href="index.jsp";},1000);
    	}
    	else if(data == "null")
    	{
    		alert("该用户不存在!");
    	}
    	else if(data == "n")
    	{
    		alert("密码错误!");
    	}
    });*/
});
</script>

</body>
</html>