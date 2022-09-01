let id = "hong";
console.log(id);

// 재선언 불가
// let id="kim";

// 재할당 가능
id = "kim";

// 블록스코프
let job = "teacher";
{
  let job = "student";
  console.log(job);
}
console.log(job);
