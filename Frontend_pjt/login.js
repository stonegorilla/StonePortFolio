const loginBtn = document.querySelector("#idBtn");
const userId = document.querySelector("#userId");
const password = document.querySelector("#password");
let xhr;
function requestMsg() {
  xhr = new XMLHttpRequest();
  xhr.onreadystatechange = callbackFunc;
  xhr.open("GET", "./data/user.json");
  xhr.send(null);
}
function callbackFunc() {
  if (xhr.readyState == 4) {
    if (xhr.status == 200) {
      //JSON 파일을 읽어왔다. (얘는 어짜피 문자열)
      let userList = JSON.parse(xhr.response);
      console.log(userList);
      let verified = false;
      for (let i = 0; i < userList.length; i++) {
        console.log(userList[i]);
        if (
          userList[i].userId === userId.value &&
          userList[i].userPw === password.value
        ) {
          verified = true;
          let { userPw, ...rest } = userList[i];

          localStorage.setItem("user", JSON.stringify(rest));
          location.href = "./main.html";
        }
      }
      if (!verified) {
        alert("회원정보가 없거나 비밀번호가 다릅니다.");
        userId.value = "";
        password.value = "";
      }
    }
  }
}

loginBtn.addEventListener("click", () => {
  requestMsg();
});
