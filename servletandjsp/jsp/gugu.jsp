 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 이거슨 html 주석입니당 -->
	<%-- 이것은 JSP 주석입니당 얘는 F12에 안나오지요 --%>
	<h1>구구단</h1>
	<%
		for(int dan = 2; dan<10; dan++){
			for(int i=1; i<=9; i++){
				out.print(dan+" * "+i+" = "+(dan*i));
				// out.print("<br>");
				%>
				<br>
				<% 
			}
			
		}
	%>
</body>
</html>