<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="renderer" content="webkit">
  <title>登录</title>
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
</head>
<body class="hold-transition login-page">
<div class="login-box">
  
  <div class="login-box-body" style="background-color:#f3f3f3;">
	<p class="text-red" id="errorMsg" style="margin-left: 45px;">&nbsp;</p>
    <form action="" id="loginForm" method="post" class="form-horizontal">
      <div class="form-group" >
	    <div class="col-xs-8 col-sm-8 input-group">
	    	<div class="input-group-addon"><i class="fa fa-user"></i></div>
	      	<input type="text" name="userName" class="form-control" id="inputUserName" placeholder="请输入用户名">
	    </div>
	  </div>
	  <div class="form-group" >
	    <div class="col-xs-8 col-sm-8 input-group">
	    	<div class="input-group-addon"><i class="fa fa-lock"></i></div>
	      	<input type="password" name="password" class="form-control" id="inputPassword" placeholder="请输入密码">
	    </div>
	  </div>
	  <div class="form-group">
	    <div class="col-xs-8 col-sm-8">
	      <input class="btn btn-primary btn-block" id="myButton" @click="post" type="button" value="登录" />
	    </div>
	  </div>
    </form>
  </div>
</div>
<#include "../common/common-js.ftl" parse=true encoding="utf-8">
<script>
window.onload = function(){
    var vm = new Vue({
        el:'#myButton',
        methods:{
            post:function(){
            	var params = new URLSearchParams();
				params.append('userName', $("#inputUserName").val());
				params.append('password', $("#inputPassword").val());
            	var url = "./user/userLogin";
                //发送 post 请求
                axios.post(url,params).then(function(data){
                    if(data.data.state=="1"){
                    	window.location.href="${ctx}/user/getUserList";
                    }else{
                    	alert("登录失败");
                    }
                }).catch(function(error){
                    alert(error);
                });
            }
        }
    });
}
</script>
</body>
</html>
