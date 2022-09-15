let search_btn = document.querySelector("#basic-addon2");
search_btn.addEventListener("click", func_search);

document.querySelector("#keyword").addEventListener("keyup", (event) => {
  if (event.keyCode === 13) {
    document.getElementById("basic-addon2").click();
  }
});

function func_search() {
  let keyword = document.getElementById("keyword").value;
  document.getElementById(
    "search-title"
  ).innerHTML = `&#128269;<span>'${keyword}' 검색 결과</span>`;
  if (keyword == "") {
    document.getElementById(
      "search-cards"
    ).innerHTML = `<div class="no-result">검색할 키워드를 입력해 주세요&#128522;</div>`;
  } else {
    let list = new XMLHttpRequest();
    list.onreadystatechange = () => {
      if (list.readyState == 4) {
        if (list.status == 200) {
          let videos = JSON.parse(list.response);

          document.getElementById("search-cards").innerHTML = "";
          let cnt = 0;
          for (let i = 0; i < videos.length; i++) {
            let video = videos[i];
            if (video["title"].includes(keyword)) {
              let video_add = document.createElement("div");

              if (cnt % 4 == 0) {
                let make_container = document.createElement("div");
                if (cnt == 0) {
                  make_container.setAttribute(
                    "class",
                    "carousel-item col active"
                  );
                } else {
                  make_container.setAttribute("class", "carousel-item col");
                }
                make_container.innerHTML = `<div class="cards-wrapper" id="selcards${parseInt(
                  cnt / 4
                )}"></div>`;
                document.getElementById("search-cards").append(make_container);
              }

              video_add.setAttribute("class", "card h-70");

              video_add.innerHTML = `
              <a href="./detail.html">
              <img src="https://img.youtube.com/vi/${video["id"]}/mqdefault.jpg" class="card-img-top imgBtn" id=${video["no"]}>
              <div class="card-body">
                <h6 class="card-title">${video["title"]}</h6>
                <p class="card-text"></p>
                <span class="btn btn-secondary">${video["part"]}</span>
              </div>
              <div class="card-footer">
                <small class="text-muted">${video["channelName"]}</small>
              </div>
              `;
              document
                .getElementById(`selcards${parseInt(cnt / 4)}`)
                .append(video_add);
              cnt += 1;
            }
          }
          if (document.getElementById("search-cards").innerHTML == "") {
            document.getElementById(
              "search-cards"
            ).innerHTML = `<div class="no-result">검색 결과가 없습니다&#128557;</div>`;
          } else {
            document.getElementById("search-cards").innerHTML += `
            <a class="carousel-control-prev" href="#carouselControlsresearch" role="button" data-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselControlsresearch" role="button" data-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
            `;
          }

          const imgBtn = document.querySelectorAll(".imgBtn");
          for (let i = 0; i < imgBtn.length; i++) {
            imgBtn[i].addEventListener("click", () => {
              localStorage.setItem("videoNo", imgBtn[i].id);
            });
          }
        }
      }
    };
    list.open("GET", "data/video.json");
    list.send();
  }
}
