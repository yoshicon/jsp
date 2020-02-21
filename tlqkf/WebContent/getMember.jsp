<%@page import="com.naz.tlqkf.dao.MemberTbDAO"%>
<%@page import="com.naz.tlqkf.vo.MemberTbVO"%>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#ffccbb">

<a href="memberIn.html"><h1>멤버 조회 결과</h1></a>
<table>
<%
	MemberTbDAO dao = new MemberTbDAO();
	List<MemberTbVO> list = dao.getMembers();
	int getCount = list.size();
	for(int i = 0; i < getCount; i++){
%>
	<tr>
		<td>
			<%= list.get(i).getUserName() %>
		</td>
		<td>
			<%= list.get(i).getUserId() %>
		</td>
		<td>
			<%= list.get(i).getUserPw() %>
		</td>
		<td>
			<%= list.get(i).getUserAddr() %>
		</td>
	</tr>
<% } %>
</table>
</body>
</html>