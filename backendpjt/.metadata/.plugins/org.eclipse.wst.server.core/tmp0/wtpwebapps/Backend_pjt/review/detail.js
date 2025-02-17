const createBtn = document.querySelector("#createBtn");
const tableTag = document.querySelector("#table");
const videoTag = document.querySelector("#video");
const reviewTitle = document.querySelector("#reviewTitle"); 
const reviewContent = document.querySelector("#reviewContent"); 
      
//window.addEventListener("load",() => {
//  showReview()
//});

const showReview = () => {
	const reviewTitle = document.querySelector("#reviewTitle"); 
	const reviewContent = document.querySelector("#reviewContent");
  reviewTitle.innerHTML = null;
  reviewContent.innerHTML = null;
  
}

createBtn.addEventListener("click",()=>{
  if(createBtn.innerText == "리뷰 작성"){
    createReview();
  }else{
    showReview();
  }
  
})

const createReview = () => {
  const formTag = document.querySelector("#formTag");
  if(document.querySelector('#reviewTitle') == null){
	  
	  const reviewTitle = document.createElement("div");
	  reviewTitle.setAttribute("class", "input-group mb-3");
	  reviewTitle.setAttribute("id","reviewTitle");
	  reviewTitle.innerHTML = `
	  <span class="input-group-text" id="basic-addon1">제목</span>
	  <input type="text" class="form-control" placeholder="제목을 작성하시오." name="title" aria-label="Username" aria-describedby="basic-addon1">
	  `
	  formTag.appendChild(reviewTitle);

	  const reviewContent = document.createElement("div");
	  reviewContent.setAttribute("id","reviewContent");
	  reviewContent.setAttribute("class", "input-group");
	  reviewContent.innerHTML = `
	  <span class="input-group-text">내용</span>
	  <textarea class="form-control" aria-label="내용" name="content" placeholder="내용을 작성하시오."></textarea>
	  
	  `
	  formTag.appendChild(reviewContent);
	  
	  formTag.innerHTML += `
		  <div class="d-grid gap-2 d-md-flex justify-content-md-end">
		    <button class="btn btn-secondary me-md-2" >등록</button>&nbsp;
		    <button class="btn btn-secondary" type="button" id="gotoReviewDetail">취소</button>
		  </div>
		  `
  }
  
	
 

 

 
  const gotoReviewDetailBtn = document.querySelector("#gotoReviewDetail");
gotoReviewDetailBtn.addEventListener("click",() => {
	showReview();
})
}

const reviewDetail = () => {
  tableTag.innerHTML = null;
  createBtn.innerText = "목록";
  let vNo = localStorage.getItem("videoNo");
  let rNo = localStorage.getItem("reviewNo");
  let videoList
  xhr = new XMLHttpRequest();
  xhr.onreadystatechange = () => {
    if(xhr.readyState == 4){
      if(xhr.status == 200){
        videoList = JSON.parse(xhr.response);
        console.log(vNo,rNo)
        console.log(videoList[vNo].review[rNo]);

        tableTag.innerHTML = `
        <table class="table table-striped">
          <tr><td>번호</td><td>${videoList[vNo].review[rNo].no}</td></tr>
          <tr><td>제목</td><td>${videoList[vNo].review[rNo].title}</td></tr>
          <tr><td>내용</td><td>${videoList[vNo].review[rNo].content}</td></tr>
          <tr><td>작성자</td><td>${videoList[vNo].review[rNo].writer}</td></tr>
          <tr><td>조회수</td><td>${videoList[vNo].review[rNo].views}</td></tr>
          <tr><td>작성시간</td><td>${videoList[vNo].review[rNo].createTime}</td></tr>
        </table>
        `;


        // const divTag1 = document.createElement("div");
        // const divTag2 = document.createElement("div");
        // const divTag3 = document.createElement("div");
        // const divTag4 = document.createElement("div");
        // const divTag5 = document.createElement("div");
        // const divTag6 = document.createElement("div");
        // divTag1.innerText = videoList[vNo].review[rNo].no;
        // divTag2.innerText = videoList[vNo].review[rNo].title;
        // divTag3.innerText = videoList[vNo].review[rNo].content;
        // divTag4.innerText = videoList[vNo].review[rNo].writer;
        // divTag5.innerText = videoList[vNo].review[rNo].views;
        // divTag6.innerText = videoList[vNo].review[rNo].createTime;
        // tableTag.appendChild(divTag1);
        // tableTag.appendChild(divTag2);
        // tableTag.appendChild(divTag3);
        // tableTag.appendChild(divTag4);
        // tableTag.appendChild(divTag5);
        // tableTag.appendChild(divTag6);
      }
    }
  }
  xhr.open("GET","/Backend_pjt/review/data/video.json");
  xhr.send();
}