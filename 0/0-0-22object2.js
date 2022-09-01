let student = {
  name: "김싸피",
  age: 20,
  hobby: ["공부", "숙면"],
  "favorite singer": "아이유",
};

console.log(student.name);
console.log(student["age"]);
console.log(student.hobby);
console.log(student["favorite singer"]);

//프로퍼티 생성
var member = {};
member["id"] = "shy";
member.name = "싸피";
member.email = "ssaft@a.com";

//프로퍼티 수정
member["id"] = "ssafy";
member.email = "ssafy@ssafy.com";

//프로퍼티 제거
delete member.id;
console.log(member);

// 얕은 복사 (member와 member2 가 같은 것을 가리킴, java의 singleton이 떠오른다.)
let member2 = member;
member2.email = "ssafy@naver.com";
console.log(member);
console.log(member2);
