var m1 = { name: "홍길동" };
var m2 = { name: "배수지" };

function msg() {
  console.log(this);
  console.log(this.name);
}
m1.msg = msg;
m2.msg = msg;

m1.msg();
m2.msg();
