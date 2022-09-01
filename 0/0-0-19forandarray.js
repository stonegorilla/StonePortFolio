let student = {
  name: "김싸피",
  age: 20,
  hobby: ["공부", "숙면"],
  "favorite singer": "아이유",
};

for (key in student) {
  console.log(key);
  console.log(student[`${key}`]);
}

let food = ["김밥", "사이다", `떡볶이`];

// 얘는 java의 (String st : student).. 뭐 이런거와 비슷하네
for (val of food) {
  console.log(val);
}

var arr1 = [];
var arr2 = new Array();

arr1[0] = 10;
arr1[2] = 30;
console.log(arr1);
console.log(arr1[1]);
arr1[3] = "문자열";
arr1[4] = {};
arr1[5] = [1, 2, 3];
arr1[6] = true;
// 객체처럼 또 넣을 수 있네 ㅋㅋㅋ
arr1["msg"] = "피자먹으로 가즈아~";

console.log(arr1);

arr1.push("추가");
console.log(arr1);
arr1.pop();
arr1.unshift("추가");
console.log(arr1);
arr1.shift();

// arr1.includes() arr1.indexOf() arr1.join()
