video_list = new XMLHttpRequest();
video_list.onreadystatechange = callback_search;
video_list.open("GET", "/Backend_pjt/board/data/video.json");
video_list.send();

function callback_search() {
  if (video_list.readyState == 4) {
    if (video_list.status == 200) {
      let videos = JSON.parse(video_list.response);

      for (let i = 0; i < videos.length; i++) {
        let video = videos[i];
        let video_add = document.createElement("div");

        if (i % 4 == 0) {
          let make_container = document.createElement("div");
          if (i == 0) {
            make_container.setAttribute("class", "carousel-item col active");
          } else {
            make_container.setAttribute("class", "carousel-item col");
          }
          make_container.innerHTML = `<div class="cards-wrapper" id="cards${parseInt(
            i / 4
          )}"></div>`;
          document.getElementById("recent-card").append(make_container);
        }
        video_add.setAttribute("class", "card h-70");

        // localStorage.setItem("videoNo", i);
        video_add.innerHTML = `
        <a href="review?act=reviewList&boardIdx=${video["no"]}">
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
        // console.log(i/5);
        document.getElementById(`cards${parseInt(i / 4)}`).append(video_add);
      }

      const imgBtn = document.querySelectorAll(".imgBtn");
      for (let i = 0; i < imgBtn.length; i++) {
        imgBtn[i].addEventListener("click", () => {
          localStorage.setItem("videoNo", imgBtn[i].id);
        });
      }
    }
  }
}
