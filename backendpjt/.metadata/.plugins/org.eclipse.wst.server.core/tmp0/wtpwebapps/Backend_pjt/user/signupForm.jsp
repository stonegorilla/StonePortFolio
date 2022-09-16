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
        background-image: url("/Backend_pjt/user/exercise.jpg");
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
      <div id="wrapper">
      <h1 >회원가입</h1>
      <input type="hidden" name="act" value="signUp">
      		 <div>
        <!-- <input type="hidden" name="action" value="regist" /> -->
        <label>아이디 : &nbsp;&nbsp;&nbsp; </label>
        <input type="text" placeholder="아이디를 입력하세요" id="userId" name="userId" required /><br />
      </div>

      <div>
        <label>비밀번호 : &nbsp;&nbsp; </label>
        <input
          type="password"
          placeholder="비밀번호를 입력하세요"
          id="password"
          name="password"
        />
      </div>
      <div>
        <label>이름 : &nbsp;&nbsp;&nbsp;&nbsp; </label>
        <input
          type="text"
          placeholder="이름을 입력하세요"
          id="name"
          name="name"
        />
      </div>
      <div>
        <label>닉네임 : &nbsp;&nbsp; </label>
        <input
          type="text"
          placeholder="닉네임을 입력하세요"
          id="nickname"
          name="nickname"
        />
      </div>
      <div>
        <label>이메일 : &nbsp;&nbsp; </label>
        <input
          type="email"
          placeholder="이메일을 입력하세요"
          id="email"
          name="email"
        />
      </div>
      <div>
        
    
        <button id="signupBtn" >회원가입</button>
        
          
        
        
      </div>
    
        <div>
          아이디 : ssafy , 비밀번호 : 1234
        </div>
      </div>
      </div>
      </form>
     
    
  
    <script>
       
    </script>
    
  </body>
</html>
