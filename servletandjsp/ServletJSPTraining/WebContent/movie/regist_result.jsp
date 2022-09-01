<%@page import="dto.Movie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
	<h2>등록 결과</h2>
	<%
		Movie movie = (Movie)request.getAttribute("movie");
	%>
	
	
	<table>
	<tr>
		<th>항목</th>
		<th>내용</th>
		</tr>
		<tr>
		<td>제목</td>
		<td><%=movie.getTitle() %></td>
		</tr>
		<tr>
		<td>감독</td>
		<td><%=movie.getDirector() %></td>
		</tr>
		<tr>
		<td>장르</td>
		<td><%=movie.getGenre() %></td>
		</tr>
		<tr>
		<td>상영시간</td>
		<td><%=movie.getRunningTime() %></td>
		</tr>
		
	</table>
</body>
</html>