<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="main page">
<meta name="author" content="yeji">


</head>
<body>
    <h1>Hello world!</h1>
 
 	<button type="button" onClick="location.href='signup'">sign up</button>
 	
    <table>
        <thead>
            <tr>
            	  <th>seq</th>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>
                <th>e-mail</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${memberList}" var="member">
                <tr>
                	  <td>${member.seq}</td>
                    <td>${member.userid}</td>
                    <td>${member.userpw}</td>
                    <td>${member.username}</td>
                    <td>${member.useremail}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
 
 
</body>
</html>

