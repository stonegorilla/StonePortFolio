const createBtn = document.querySelector("#createBtn");
const tableTag = document.querySelector("#table");
const videoTag = document.querySelector("#video");
      
window.addEventListener("load",() => {
  showReview()
});

const showReview = () => {
  tableTag.innerHTML = null;
  let vNo = localStorage.getItem("videoNo");
  let videos;
  createBtn.innerHTML = "리뷰 작성"
  xhr = new XMLHttpRequest();
  xhr.onreadystatechange = () => {
    if(xhr.readyState == 4){
      if(xhr.status == 200){
                
        videos = JSON.parse(xhr.response);
        videoTag.innerHTML = `
        <iframe width="560" height="315" src='${videos[vNo]['url']}' 
        title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; 
        clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>`;

        const realTableTag = document.createElement("table");
        realTableTag.setAttribute("class", "table table-striped table-hover");
        for(let i=0; i<1; i++){
          const trTag = document.createElement("tr");
          const tdTag1 = document.createElement("th");
          const tdTag2 = document.createElement("th");
          const tdTag3 = document.createElement("th");
          const tdTag4 = document.createElement("th");
          const tdTag5 = document.createElement("th");
          tdTag1.innerText = "번호";
          tdTag2.innerText = "제목";
          tdTag3.innerText = "작성자";
          tdTag4.innerText = "조회수";
          tdTag5.innerText = "작성시간";
          //  tdTag1.setAttribute("class","toList");
          trTag.appendChild(tdTag1);
          trTag.appendChild(tdTag2);
          trTag.appendChild(tdTag3);
          trTag.appendChild(tdTag4);
          trTag.appendChild(tdTag5);
          realTableTag.appendChild(trTag);
        }
        for(let i=0 ; i< videos[vNo].review.length; i++){
          const trTag = document.createElement("tr");
          const tdTag1 = document.createElement("td");
          const tdTag2 = document.createElement("td");
          const tdTag3 = document.createElement("td");
          const tdTag4 = document.createElement("td");
          const tdTag5 = document.createElement("td");
          tdTag1.innerText = videos[vNo].review[i].no;
          tdTag2.innerText = videos[vNo].review[i].title;
          tdTag3.innerText = videos[vNo].review[i].content;
          tdTag4.innerText = videos[vNo].review[i].views;
          tdTag5.innerText = videos[vNo].review[i].createTime;
          tdTag1.setAttribute("class","toList");
          trTag.appendChild(tdTag1);
          trTag.appendChild(tdTag2);
          trTag.appendChild(tdTag3);
          trTag.appendChild(tdTag4);
          trTag.appendChild(tdTag5);
          realTableTag.appendChild(trTag);
        }
        tableTag.appendChild(realTableTag);
        const toList=document.querySelectorAll(".toList") ;
for(let i=0; i<toList.length; i++){
  toList[i].addEventListener("click",() =>{
    // toList.forEach(element => {
    localStorage.setItem("reviewNo",i);
    reviewDetail();
// });
  })
}
      }
    }
    
  }
  
  xhr.open("GET","data/video.json");
    xhr.send();
}

createBtn.addEventListener("click",()=>{
  if(createBtn.innerText == "리뷰 작성"){
    createReview();
  }else{
    showReview();
  }
  
})

const createReview = () => {
  
  tableTag.innerHTML = null;

  const reviewTitle = document.createElement("div");
  reviewTitle.setAttribute("class", "input-group mb-3");
  reviewTitle.innerHTML = `
  <span class="input-group-text" id="basic-addon1">제목</span>
  <input type="text" class="form-control" placeholder="제목을 작성하시오." aria-label="Username" aria-describedby="basic-addon1">
  `
  tableTag.appendChild(reviewTitle);

  const reviewContent = document.createElement("div");
  reviewContent.setAttribute("class", "input-group");
  reviewContent.innerHTML = `
  <span class="input-group-text">내용</span>
  <textarea class="form-control" aria-label="내용" placeholder="내용을 작성하시오."></textarea>
  `
  tableTag.appendChild(reviewContent);

  // const inputTitleTag = document.createElement("input");
  // inputTitleTag.setAttribute("id", "review-title")
  // inputTitleTag.placeholder = "제목"
  // tableTag.appendChild(inputTitleTag);

  // const inputContentTag = document.createElement("input");
  // inputContentTag.setAttribute("id", "review-content")
  // inputContentTag.placeholder = "내용"
  // tableTag.appendChild(inputContentTag);

  table.innerHTML += `
  <div class="d-grid gap-2 d-md-flex justify-content-md-end">
    <button class="btn btn-secondary me-md-2" type="button">등록</button>&nbsp;
    <button class="btn btn-secondary" type="button" id="gotoReviewDetail">취소</button>
  </div>
  `
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
  xhr.open("GET","data/video.json");
  xhr.send();
}