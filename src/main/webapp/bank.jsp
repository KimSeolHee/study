<%@page import="com.iu.start.bankBook.BankBookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.iu.start.bankBook.BankBookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Bank Page</h1>
	<%
		BankBookDAO dao = new BankBookDAO();
		ArrayList<BankBookDTO> ar = dao.getList();
	%>
	
	<h1>Book List</h1>
	<% for(BankBookDTO dto: ar){	%>
		<h3>BookNum: <%= dto.getBookNum() %></h3>
		<h3>BookName: <%= dto.getBookName() %></h3>
	<%} %>
</body>
</html>