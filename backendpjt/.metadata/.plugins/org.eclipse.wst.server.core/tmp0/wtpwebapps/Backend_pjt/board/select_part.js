window.onload = select_func("all");

function select_func(id) {
  list_video = new XMLHttpRequest();
  list_video.onreadystatechange = () => {
    if (list_video.readyState == 4) {
      if (list_video.status == 200) {
        let select_video = JSON.parse(list_video.response);
        let type;
        if (id == "all") type = "전신";
        else if (id == "top") type = "상체";
        else if (id == "bottom") type = "하체";
        else if (id == "stomach") type = "복부";

        document.getElementById("select-cards").innerHTML = "";
        let cnt = 0;
        for (let i = 0; i < select_video.length; i++) {
          let video = select_video[i];
          if (video["part"] == type) {
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
              document.getElementById("select-cards").append(make_container);
            }

            video_add.setAttribute("class", "card h-70");
            // video_add.setAttribute("style", "width: 18rem;");

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
            cnt += 1;
            document
              .getElementById(`selcards${parseInt(cnt / 4)}`)
              .append(video_add);
          }
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
  list_video.open("GET", "/Backend_pjt/board/data/video.json");
  list_video.send();
}
