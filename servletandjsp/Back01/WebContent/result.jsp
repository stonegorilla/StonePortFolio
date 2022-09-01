<%@page import="person.Person"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>등록 결과</h2>
	<%
		Person p = (Person)request.getAttribute("person");
	%>
	
	<p>등록된 총인원 : <%=request.getAttribute("size") %> 명</p>
	<table>
		<tr>
		<td>이름</td>
		<td><%=p.getName() %></td>
		
		</tr>
		
	</table>
</body>
</html>