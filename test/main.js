let jjim = false;
btn = document.querySelectorAll(".trigger");
btn.forEach((element) => {
  element.addEventListener("click", () => {
    for (let i = 0; i < 4; i++) {
      console.log(element.parentNode.getElementsByTagName("div")[i].innerHTML);
    }
  });
});
