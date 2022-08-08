<%@page import="com.iu.start.member.BankMembersDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    ArrayList<BankMembersDTO> ar = (ArrayList<BankMembersDTO>)request.getAttribute("list");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member List Page</h1>
	
	<table border="1">
		<thead>
			<tr>
				<th>Id</th><th>Pw</th><th>Name</th><th>Email</th><th>Phone</th>
			</tr>
		</thead>
		<tbody>
			<tr>
			<%  for(BankMembersDTO dto:ar) {%>
			<td><%=dto.getId() %></td>
			<td><%=dto.getPw() %></td>
			<td><%=dto.getName() %></td>
			<td><%=dto.getEmail() %></td>
			<td><%=dto.getPhone() %></td>
			<%} %>
			</tr>
		</tbody>
	</table>
	
</body>
</html>