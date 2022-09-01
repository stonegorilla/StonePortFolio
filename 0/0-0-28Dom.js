let ele = document.querySelectorAll(".b");
console.log(ele);
for (let i = 0; i < ele.length; i++) {
  console.log(ele[i].innerHTML);
}

let ele2 = document.createElement("img");
ele2.setAttribute("src", "cake.jpg");
ele2.setAttribute("width", 200);
ele2.setAttribute("height", 150);

let parent = document.querySelector("section");
parent.append(ele2);
