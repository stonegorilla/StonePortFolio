// function func() {
//   console.log("선언식");
// }

// b() 에 b 생략해도 됨
// let a = function b() {
//   console.log("표현식");
// };

// a();

function func() {
  console.log("앙");
  return function (num1, num2) {
    return num1 + num2;
  };
}

function func2() {}

// callFn 은 return 된 값 (여기선 함수)
let callFn = func();

let result = callFn(100, 200);
console.log(result);

console.log(func2()); //undefined 출력

// 10 이라는 데이터에 aaa 라는 이름을 붙이자
let aaa = 10;
console.log(aaa);
console.log(aaa + 10);

let bbb = function () {
  console.log("나는 익명 함수");
};
bbb();
console.log(bbb);

let myFunc1 = function () {
  console.log("나도 함수...");
  return 3;
};
// ret1엔 return 된 값 3이 저장
let ret1 = myFunc1();
console.log(ret1 + 3);

let myFunc2 = function () {
  console.log("나도도 함수...");
  return function () {
    console.log("반환되는 함수...");
  };
};
let ret2 = myFunc2();

ret2();

let myFunc3 = function (a) {
  console.log("a라는 매개변수를 받은 함수...");
  a();
};

myFunc3(function () {
  console.log("매개변수로 전달되는 함수");
});
