<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
  
  <div >
    <button id="createBtn" type="button" class="btn btn-outline-secondary">리뷰 작성</button>
  </div>
  
  <div id = "table">
  <table class="table table-striped table-hover">
  	<tr>
  		<th>번호</th>
  		<th>제목</th>
  		<th>작성자</th>
  		<th>조회수</th>
  		<th>작성 시간</th>
  	</tr>
  	
    <c:forEach var="review" items="${reviewList}" varStatus="i">
    	<tr>
    	<td>
    		<a href="review?act=reviewDetail&boardIdx=${board.idx}&reviewIdx=${review.idx}">
    		${review.idx }
    		</a>
    		</td>
    		<td>${review.title }</td>
    		<td>${writerList.get(i.index)}</td>
    		<td>${review.views }</td>
    		<td>${review.createTime }</td>
    	</tr>
    	
    </c:forEach>
  </table>
  	
  </div>
  <form action="review" id="formTag" method="post">
  	<input type="hidden" name="act" value="reviewCreate">
  	<input type="hidden" name="boardIdx" value="${board.idx }">
  </form>
  <script src="/Backend_pjt/review/detail.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script type="text/javascript" src="/Backend_pjt/review/bootstrap/js/bootstrap.js"></script>
</body>
</html>