<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 메인화면 -->
<html>
  <head lang="ko">
    <meta charset="UTF-8">
    <title>SSAFIT</title>
    <link rel="stylesheet" href="/Backend_pjt/board/main.css">
    <link rel="stylesheet" href="/Backend_pjt/board/bootstrap/css/bootstrap.css">
    <!-- google icon-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
  </head>
  <body>
    <!-- 헤더 -->
    <header>
      <div class="page-top">
        <span id="title">SSaFit&#128170;</span>
        <span>
          <a href="/Backend_pjt/board?act=main" class="material-symbols-outlined">HOME</a>
          <!-- <a href="join.html" class="material-symbols-outlined">PERSON_ADD</a> -->
          <a href="/Backend_pjt/user?act=loginForm" class="material-symbols-outlined">LOGIN</a>
          <!-- <a href="logout.html" class="material-symbols-outlined">LOGOUT</a> -->
        </span>
      </div>
      <div id="carouselControlsBanner" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner">
          <div class="carousel-item active" data-bs-interval="10000">
            <img src="/Backend_pjt/img/gym-gd5f9bf962_1280.jpg" class="d-block w-100" id="banner1">
            <div class="image-name">health</div>
          </div>
          <div class="carousel-item" data-bs-interval="10000">
            <img src="/Backend_pjt/img/dumbbells-gbb01cca30_1280.jpg" class="d-block w-100" id="banner2">
            <div class="image-name">diet</div>
          </div>
          <div class="carousel-item" data-bs-interval="10000">
            <img src="/Backend_pjt/img/weight-lifting-g6f7c7bf2f_1280.jpg" class="d-block w-100" id="banner3">
            <div class="image-name">training</div>
          </div>
        </div>
        <a class="carousel-control-prev" href="#carouselControlsBanner" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselControlsBanner" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
    </header>

    <!-- 검색창 -->
    <section>
      <div class="input-group mb-3 search-input">
        <span id="search-icon" class="input-group-text material-symbols-outlined">SEARCH</span>
        <input id="keyword" type="text" class="form-control btn btn-light" placeholder=" 검색할 키워드를 입력해 주세요">
        <button type="button" class="input-group-text btn btn-outline-dark" id="basic-addon2">검색</button>
      </div>
      <div id="carouselControlsresearch" class="carousel slide" data-ride="carousel">
        <h3 id="search-title"></h3>
        <div class="carousel-inner row row-cols-1" id="search-cards"></div>
      </div>
    </section>
    <script src="/Backend_pjt/board/search.js"></script>

    <!-- 최근 가장 많이 본 영상 -->
    <section class="recent" id="multiple-items">
      <h3>&#127916;최근 가장 많이 본 영상</h3>
      <div id="carouselExampleControls2" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner" id="recent-card">

        </div>
        <a class="carousel-control-prev" href="#carouselExampleControls2" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleControls2" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
    </section>
    <script src="/Backend_pjt/board/recent.js"></script>

    <!-- 운동 부위 선택 -->
    <section class="select-part">
      <h3>&#128194;신체 부위별 운동 영상</h3>
      <div id="buttons">
        <button type="button" class="btn btn-outline-dark checked" id="all"  onclick="select_func(this.id)">전신</button>
        <button type="button" class="btn btn-outline-dark unchecked" id="top" onclick="select_func(this.id)">상체</button>
        <button type="button" class="btn btn-outline-dark unchecked" id="bottom" onclick="select_func(this.id)">하체</button>
        <button type="button" class="btn btn-outline-dark unchecked" id="stomach" onclick="select_func(this.id)">복부</button>
      </div>
      <div id="carouselExampleControls3" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner" id="select-cards">

        </div>
        <a class="carousel-control-prev" href="#carouselExampleControls3" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleControls3" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
      <div id="select_part"></div>
    </section>
    <script src="/Backend_pjt/board/select_part.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="/Backend_pjt/board/bootstrap/js/bootstrap.js"></script>
  </body>
</html>