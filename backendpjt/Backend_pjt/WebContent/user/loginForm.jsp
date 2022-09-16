<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <style>

      body{
        background-image: url("/Backend_pjt/img/exercise.jpg");
        background-size: 100%;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        padding-top: 100px;
        
      }
      #wrapper{
      
        width : 700px;
        height: 700px;
        opacity: 0;
        display: flex;
        flex-direction: column;
        justify-content: space-around;
        align-items: center;
        transition: 2s;
        border-radius: 10px;
        
      }
      #wrapper:hover{
        opacity: 100;
        background-color: black;
        color : white;
        transition : 2s;
      }
      input{
        width : 200px;
        height : 50px;
        border-radius : 15px;
      }
      #idBtn{
        width : 100px;
        height: 50px;
        background-color: blue;
        color: white;
        border-radius: 25px;
        border :0px;
      }
      #signupBtn{
        width : 100px;
        height: 50px;
        background-color: blue;
        color: white;
        border-radius: 25px;
        border :0px;
      }
    </style>
  </head>
  <body>
  <form action="user" method="post">
  
  <input type="hidden" name="act" value="testLogin">
    <div id="wrapper">
      <h1 >로그인</h1>
      <div>
        
        <label>아이디 : &nbsp;&nbsp; </label>
        <input type="text" placeholder="아이디를 입력하세요" id="userId" name="userId" /><br />
      </div>

      <div>
        <label>비밀번호 : &nbsp; </label>
        <input
          type="password"
          placeholder="비밀번호를 입력하세요"
          id="password"
          name = "password"
        />
      </div>
        
      <div>
      
      	<button id="idBtn">로그인</button>
      
        
         <a href="user?act=signUpForm">
          <button type="button" id="signupBtn">회원가입</button>
        </a>
        
      </div>
        
        <div>
          아이디 : ssafy , 비밀번호 : 1234
        </div>
      </div>
    </div>
    
    </form>
    
  </body>
</html>
