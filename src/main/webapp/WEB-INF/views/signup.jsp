<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>SignUp</title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="signup page">
<meta name="author" content="yeji">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$("#submit").click(function(){
		if($("#user_id").val().length==0){alert("write your id"); $("#user_id").focus(); return false;}
		if($("#user_pw").val().length==0){alert("write your pw"); $("#user_pw").focus(); return false;}
		if($("#user_name").val().length==0){alert("write your name"); $("#user_name").focus(); return false;}
		if($("#user_email").val().length==0){alert("write your email"); $("#user_email").focus(); return false;}
	});
});
</script>

</head>
<body>
    <form action = "/sign" method="post" autocomplete="off">
 		<input type="text" id="user_id" name="userid" placeholder="ID">
 		<input type="text" id="user_pw" name="userpw" placeholder="PW">
 		<input type="text" id="user_name" name="username" placeholder="NAME">
 		<input type="text" id="user_email" name="useremail" placeholder="E-MAIL">
 		<button type="submit" id="submit" name="submit">sign up</button>
 	</form>
 
 
</body>
</html>