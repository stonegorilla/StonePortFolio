<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="aaaa.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>등록 결과</h2>
	<%
		Person p = (Person)request.getAttribute("person");
	%>
	
	<p>등록된 총인원 : <%=request.getAttribute("size") %>명</p>
	
	<table>
		<tr>
		<td>이름</td>
		<td><%=p.getName() %></td>
		</tr>
		<tr>
		<td>나이</td>
		<td><%=p.getAge() %></td>
		</tr>
		<tr>
		<td>성</td>
		<td><%=p.getGender() %></td>
		</tr>
		<tr>
		<td>취미</td>
		<td><%=Arrays.toString(p.getHobbies()) %></td>
		</tr>
	</table>
	
	<%= request.getParameter("name") %>
</body>
</html>