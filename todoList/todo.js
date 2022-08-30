const inputTag = document.querySelector("#todo-input");
const todoBtn = document.querySelector("#todo-create");
const ulTag = document.querySelector("#todo-list");
const todoOKBtn = document.querySelector("#todo-OK");
const todoNOBtn = document.querySelector("#todo-NO");
const todoALLBtn = document.querySelector("#todo-ALL");
// const todoItemRegistered = { todo: content, done: false };
let todoList;

// 아 이래서 windows 가 필요한 것이었구먼
window.addEventListener("load", () => {
  todoList = localStorage.getItem("todoList");
  if (todoList != null) {
    todoList = JSON.parse(todoList);
    for (let i = 0; i < todoList.length; i++) {
      createTodoItem(todoList[i]);
    }
  } else {
    todoList = [];
  }
});

const registTodo = () => {
  const content = inputTag.value;
  if (!content.trim()) {
    alert("글을 써주세용~!");
  } else {
    const todoItem = { todo: content, done: false };
    createTodoItem(todoItem);
    // inputTagvalue 다시 빈값으로 (새로운 값을 받아야 하니까)(안하면 , 그대로 input 창안에 남아있음 )

    todoList.push(todoItem);
    localStorage.setItem("todoList", JSON.stringify(todoList));

    inputTag.value = "";
    inputTag.focus();
  }
};

// 얘는 화면에 뿌려주는 얘
const createTodoItem = (todoItem) => {
  const liTag = document.createElement("li");
  const spanTag = document.createElement("span");
  spanTag.innerText = todoItem.todo; //todoItem이 가지고 있는 todo 넣기
  spanTag.addEventListener("click", () => {
    toggleTodo(todoItem.todo);
  });
  if (todoItem.done) {
    spanTag.setAttribute("class", "done");
  }
  const delBtn = document.createElement("button");
  delBtn.innerText = "X";
  delBtn.addEventListener("click", () => {
    removeTodo(todoItem.todo);
  });
  liTag.appendChild(spanTag);
  liTag.appendChild(delBtn);
  ulTag.appendChild(liTag);
};

const toggleTodo = (todo) => {
  event.target.classList.toggle("done");
  for (let i = 0; i < todoList.length; i++) {
    if (todoList[i].todo == todo) {
      todoList[i].done = !todoList[i].done;
    }
  }
  localStorage.setItem("todoList", JSON.stringify(todoList));
};
const removeTodo = (todo) => {
  event.target.parentElement.remove();
  todoList = todoList.filter((todoItem) => todoItem.todo != todo);
  localStorage.setItem("todoList", JSON.stringify(todoList));
};

const OKList = () => {
  return todoList.filter((todoItem) => todoItem.done);
};

const NOList = () => {
  return todoList.filter((todoItem) => !todoItem.done);
};

todoOKBtn.addEventListener("click", () => {
  ulTag.innerHTML = null;
  OKList().forEach((todoItem) => {
    createTodoItem(todoItem);
  });
});

todoNOBtn.addEventListener("click", () => {
  ulTag.innerHTML = null;
  NOList().forEach((todoItem) => {
    createTodoItem(todoItem);
  });
});

todoALLBtn.addEventListener("click", () => {
  ulTag.innerHTML = null;
  todoList.forEach((todoItem) => {
    createTodoItem(todoItem);
  });
});
todoBtn.addEventListener("click", registTodo);
