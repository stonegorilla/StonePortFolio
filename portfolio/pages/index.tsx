import type { NextPage } from "next";
import Typewriter from "typewriter-effect";

const Home: NextPage = () => {
  return (
    <>
      <header style={{ backgroundColor: "gray" }}>
        <div>여기는 stonegorilla 포트폴리오</div>
        <div>헬로</div>
        <Typewriter
          options={{
            strings: [
              "Hello World~",
              "My Name is Seo",
              "I'm Backend Developer",
            ],
            autoStart: true,
            loop: true,
            delay: 75,
          }}
        />
      </header>
      <h1>만들어 놓은 것들</h1>
      <section
        style={{
          display: "flex",
          justifyContent: "center",
          backgroundColor: "yellow",
        }}
      >
        <div
          style={{
            display: "grid",
            gridTemplateRows: "372px",
            gridTemplateColumns: "382px 382px 382px",
          }}
        >
          <div>1</div>
          <div>2</div>
          <div>3</div>
          <div>4</div>
          <div>5</div>
          <div>6</div>
        </div>
      </section>
    </>
  );
};

export default Home;
