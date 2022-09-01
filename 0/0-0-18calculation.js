let a = 20;
let b = 15;

let c = 0;
if (c++ == 0) {
  console.log("이 문장은 실행될까");
}

var i = 100;
var j = "100";

// 비교시 암묵적 타입 변환을 통해 타입을 일치시킨 후 비교
console.log(i == j);
// 얘는 암묵적 타입 변환 x
console.log(i === j);
