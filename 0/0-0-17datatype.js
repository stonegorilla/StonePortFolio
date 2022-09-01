let num1 = 10; //number
let num2 = 10.2;
let msg = "hi"; // string
let bool = true; //boolean
let nullVal = null; // null
let unVal; //undefined
let obj = {}; //object
let obj2 = new Object(); // object

console.log(num1);
console.log(num2);
console.log(msg);
console.log(bool);
console.log(nullVal);
console.log(unVal);
console.log(obj);
console.log(obj2);

console.log(typeof obj);

console.log(typeof null); // 얘는 브랜든 아이크가 설계오류 했다 함

// 동적 데이터 타입
var val = 10;
console.log(val, typeof val);
val = "hello";
console.log(val, typeof val);
val = true;
console.log(val, typeof val);

let num3 = 10;
let num4 = 3.14;
let num5 = 1e9;
let num6 = Infinity;
let num7 = -Infinity;
let num8 = NaN;
// x와 y가 같지 않아
var x = 0.3 - 0.2;
var y = 0.2 - 0.1;
console.log(x);
console.log(y);

// 따라서 소수부분은 정수로 만들어서 계산
var a = 0.3;
var b = 0.2;

console.log(a - b);
console.log((a * 10 - b * 10) / 10);
