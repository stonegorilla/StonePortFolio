let msg = "자바스크립트 문자열";
msg = "자바스크립트 문자열";
msg = `자바스크립트 문자열`;

let name = "홍길동";
msg = `나의 이름은 ${name} 입니다.`;

console.log(msg);

let msg2 = `저의
                    이름은
                    홍길동 입니다.`;

console.log(msg2);

// \는 이스케이프 문자
console.log("I'm Father");
console.log("저의 \n 이름은 홀싸피 입니다.");
// https://apps.timwhitlock.info/emoji/tables/unicode#emoji-modal
// 여기서 emoji 찾을 수 있어
console.log("\u{1F60B}");

console.log("양명균".length);
console.log("양명균"[1]);
console.log("양명균".charAt(1));
console.log("양명균"[100]);
console.log("양명균".charAt(100));

console.log(1 + "20"); // 120
console.log("1" + "20"); // 120
console.log("1" + 20); // 120
console.log("100" - 8); // 92
console.log("100" * 8); // 800

console.log(Number("123n"));
console.log(Number(" 01234 "));
console.log(Number(false));
console.log(Number(undefined));
console.log(Number(null));
