<%@page import="com.iu.start.bankBook.BankBookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankView Page</h1>
	<%
		ArrayList<BankBookDTO> ar = (ArrayList<BankBookDTO>)request.getAttribute("list");
	%>
	
	<% for(BankBookDTO dto: ar){	%>
		<h3>BookNum: <%= dto.getBookNum() %></h3>
		<h3>BookName: <%= dto.getBookName() %></h3>
	<%} %>
</body>
</html>