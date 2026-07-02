import Counter from "./components/Counter"
import Home from "./components/Home"
import Loader from "./components/Loader"
import {useState} from "react";
import Child1 from "./components/Child1";
import Child2 from "./components/Child2";

function App() {
  const [value, setValue] = useState("");
  return (
    <>
    <Child2 value={value} />
    <Child1 setValue={setValue} />

    <Counter />
    <Home />
    <div
      style={{
        background: "#050505",
        height: "100vh",
        display: "grid",
        placeItems: "center",
      }}
    >
      <Loader />
      </div>
    </>
  )
}

export default App
