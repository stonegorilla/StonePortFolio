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
	<h2>��� ���</h2>
	<%
		Person p = (Person)request.getAttribute("person");
	%>
	
	<p>��ϵ� ���ο� : <%=request.getAttribute("size") %> ��</p>
	<table>
		<tr>
		<td>�̸�</td>
		<td><%=p.getName() %></td>
		
		</tr>
		
	</table>
</body>
</html>