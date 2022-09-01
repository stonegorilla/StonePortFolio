<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록</title>
</head>
<body> 
	<h2>등록페이지</h2>
	<form action="main" method="POST">
		<input type="hidden" name="action" value="regist">
		<label>제목 : </label>
		<input type="text" placeholder="제목" name="name"><br>
		<label>감독 : </label>	
		<input type="text" placeholder="감독" name="director"><br>
		<label>장르 : </label>
		<input type="text" placeholder="장르" name="genre"><br>
		<label>상영시간 : </label>
		<input type="number" min="0" placeholder="상영 시간" name="runningTime"><br>
		
		<input type="submit" value="등록">
		<button>초기화</button>
	</form>
</body>
</html>