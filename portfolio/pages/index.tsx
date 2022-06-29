import type { NextPage } from "next";
import Typewriter from "typewriter-effect";
import styled from "@emotion/styled";

const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
`;
const Button = styled.div`
  width: 100px;
  height: 50px;
  border-radius: 25px;
  background-color: blue;
  color: white;
  text-align: center;
  line-height: 50px;
`;
const Card = styled.div`
  width: 366px;
  height: 356px;
  border: 1px solid #e5e5e5;
  border-radius: 4px;
  padding: 24px 16px;
`;
const Home: NextPage = () => {
  return (
    <Wrapper>
      <header style={{ backgroundColor: "gray", width: "100%" }}>
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
      <nav
        style={{
          width: "80%",
          display: "flex",
          justifyContent: "space-around",
          alignItems: "center",
        }}
      >
        <Button>Resume</Button>
        <Button>React</Button>
        <Button>Node.js</Button>
        <Button>Algorithm</Button>
      </nav>

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
          <Card>1</Card>
          <Card>2</Card>
          <Card>3</Card>
          <Card>4</Card>
          <Card>5</Card>
          <Card>8</Card>
        </div>
      </section>
      <footer>
        Thank you for visiting my portfolio &#128526;
        <br />© Developer Stonegorilla, Powered By Next.js.
      </footer>
    </Wrapper>
  );
};

export default Home;
