const id = "hong";
console.log(id);

// 재할당 불가
// id = "kim";
// console.log(id);

//블록스코프
const a = "aaa";
{
  const a = "bbb";
  console.log(a);
}

console.log(a);

const BIRTHDAY = "2022.08.03";
