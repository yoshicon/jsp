<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String userName = request.getParameter("username");
	String userId = request.getParameter("userid");
	String userPw = request.getParameter("userpw");
	String userAddr = request.getParameter("useraddr");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="888888">

	<h1>받은거</h1>
	<p>니 이름 : <%= userName %></p>
	<p>니 id : <%= userId %></p>
	<p>니비번 : <%= userPw %></p>
	<p>니 사는데 : <%= userAddr %></p>
	
</body>
</html>