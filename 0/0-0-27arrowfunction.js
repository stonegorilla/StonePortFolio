function func1(num) {
  console.log("func1", num);
}
func1(1);
var func2 = (num) => {
  console.log("func2", num);
};
func2(1);

var func2 = (num) => {
  console.log("func2", num);
};

var func4 = function (num1, num2) {
  console.log("익명함수 func4", num1, num2);
};
func4(10, 20);
func4 = (num1, num2) => {
  console.log("익명함수 func4", num1, num2);
};
func4(10, 20);

function func5(num) {
  console.log(num * num);
}

var func5 = (num) => console.log(num * num);
func5(10);

function func6(num) {
  return num * num;
}
// 이렇게 return 문 생략 가능
var func6 = (num) => num * num;
