<%@page import="com.naz.tlqkf.vo.MemberTbVO"%>
<%@page import="com.naz.tlqkf.dao.MemberTbDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String userName = request.getParameter("username");
	String userId = request.getParameter("userid");
	String userPw = request.getParameter("userpw");
	String userAddr = request.getParameter("useraddr");
	
	MemberTbVO vo = new MemberTbVO();
	vo.setUserAddr(userAddr);
	vo.setUserId(userId);
	vo.setUserName(userName);
	vo.setUserPw(userPw);
	
	MemberTbDAO dao = new MemberTbDAO();
	int rtval = dao.memberInsert(vo);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마 못할거 모인노</title>
</head>
<body bgcolor="888888">
	<a href="memberIn.html"><h1>다시 돌아가기</h1></a>
	<p>입력된 자료 갯수 : <%= rtval %></p>
	
	<h2> 입력된 정보</h2>
	<p>이름 : <%= vo.getUserName() %></p>
	<p>아이디 : <%= userId%></p>
	<p>비번 : <%= userPw %></p>
	<p>주소 : <%= userAddr %></p>
	<a href="getMember.jsp">목록 보기</a>
</body>
</html>