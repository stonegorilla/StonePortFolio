let jjim = false;

btn = document.querySelectorAll(".trigger");
btn.forEach((element) => {
  element.addEventListener("click", () => {
    let movie = {};
    for (let i = 0; i < 4; i++) {
      let data = element.parentNode.getElementsByTagName("div")[i].innerHTML;

      movie[data.split(" :")[0]] = data.split(" :")[1];
    }
    console.log(movie);
    let jsonData = localStorage.getItem("movies");
    if (jsonData != null) {
      let parseData = JSON.parse(jsonData);
      parseData.push(movie);

      localStorage.setItem("movies", JSON.stringify(parseData));
    } else {
      let movies = [];
      movies.push(movie);
      localStorage.setItem("movies", JSON.stringify(movies));
    }
  });
});
