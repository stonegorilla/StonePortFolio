<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/Backend_pjt/review/detail.css">
  <link rel="stylesheet" href="/Backend_pjt/review/bootstrap/css/bootstrap.css">
</head>
<body>
<div id="video">
 	
    	<iframe width="560" height="315" src="${board.url}" 
        title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; 
        clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>`;
  </div>
<div>
	<a href="review?act=reviewList&boardIdx=${review.boardIdx }">
	<button class="btn btn-outline-secondary"> 목록</button>
	</a>
	
</div>
	
	<table class="table table-striped table-hover">
	
		<tr>
			<td>번호</td>
			<td>${review.idx}</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>${review.title}</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${review.content}</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${writer}</td>
		</tr>
		<tr>
			<td>조회수</td>
			<td>${review.views}</td>
		</tr>
		<tr>
			<td>작성시간</td>
			<td>${review.createTime}</td>
		</tr>
	</table>
	
</body>
</html>