const registBtn = document.querySelector("#regist");
const inputTag = document.querySelector("#todo-value");
const ulTag = document.querySelector("#todo-list");
const btnOk = document.querySelector("#btn-ok");
const btnNo = document.querySelector("#btn-no");
const btnAll = document.querySelector("#btn-all");
let todoList;
// 등록버튼을 눌렀다면 이벤트를 걸자`
function registTodo() {
  const content = inputTag.value;

  if (!content.trim()) {
    alert("할일을 입력하세용");
  } else {
    const todoItem = {
      todo: content,
      done: false,
    };
    createTodoItem(todoItem);
    inputTag.value = "";
    inputTag.focus();

    // 로컬스토리지에 직접 저장을 하자....
    todoList.push(todoItem);
    localStorage.setItem("todoList", JSON.stringify(todoList));
  }
}

const createTodoItem = (todoItem) => {
  // li 태그 생성후, 채우기
  const liTag = document.createElement("li");
  const spanTag = document.createElement("span");

  spanTag.innerText = todoItem.todo; //todoItem이 가지고 있는 todo 넣기

  spanTag.addEventListener("click", () => {
    updateTodo(todoItem.todo);
  });

  if (todoItem.done) {
    spanTag.setAttribute("class", "done");
  }
  liTag.appendChild(spanTag);

  /////////////////////////////
  const delBtn = document.createElement("button");
  delBtn.innerText = "X";
  delBtn.addEventListener("click", () => {
    removeTodo(todoItem.todo);
  });

  liTag.appendChild(delBtn);

  ulTag.appendChild(liTag);
};

const updateTodo = (todo) => {
  event.target.classList.toggle("done");

  for (let i = 0; i < todoList.length; i++) {
    if (todoList[i].todo === todo) {
      todoList[i].done = !todoList[i].done;
    }
  }

  localStorage.setItem("todoList", JSON.stringify(todoList));
};

const removeTodo = (todo) => {
  event.target.parentElement.remove();

  todoList = todoList.filter((todoItem) => todoItem.todo !== todo);
  localStorage.setItem("todoList", JSON.stringify(todoList));
};

const getOkList = () => {
  return todoList.filter((todoItem) => todoItem.done === true);
};

const getNoList = () => {
  return todoList.filter((todoItem) => todoItem.done === false);
};
window.addEventListener("load", function () {
  todoList = localStorage.getItem("todoList");
  if (todoList !== null) {
    todoList = JSON.parse(todoList);
    for (let i = 0; i < todoList.length; i++) {
      createTodoItem(todoList[i]);
    }
    console.log("뭐가 있다.");
  } else {
    todoList = [];
    console.log("이거 하네");
  }
});
// registBtn.addEventListener("click", registTodo);
// inputTag.addEventListener("keyup", function (event) {
//   if (event.code === "Enter") {
//     registTodo();
//   }
// });

// 등록 버튼을
registBtn.addEventListener("click", registTodo);

btnOk.addEventListener("click", () => {
  ulTag.innerHTML = null;

  getOkList().forEach((todoItem) => {
    createTodoItem(todoItem);
  });
});

btnNo.addEventListener("click", () => {
  ulTag.innerHTML = null;

  getNoList().forEach((todoItem) => {
    createTodoItem(todoItem);
  });
});

btnAll.addEventListener("click", () => {
  ulTag.innerHTML = null;
  todoList.forEach((todoItem) => {
    createTodoItem(todoItem);
  });
});
