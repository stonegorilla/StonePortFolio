let member1 = { id: "shy", email: "ssafy@a.com" };
let member2 = new Object();

function Member(id, email) {
  this.id = id;
  this.email = email;
}

let member3 = new Member("shy", "ssafy@a.com");

console.log(member1);
console.log(member3);
