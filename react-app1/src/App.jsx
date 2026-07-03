import Counter from "./components/Counter"
import Home from "./components/Home"
import Loader from "./components/Loader"
import {useState} from "react";
import Child1 from "./components/Child1";
import Child2 from "./components/Child2";
import StudentDataSave from "./components/StudentDataSave";
import SearchBar from "./components/SearchBar";
import SearchResult from "./components/SearchResult";
import ArrayCheckBox from "./components/ArrayCheckBox";

function App() {
  const [value, setValue] = useState("");
  const [newval, setNewVal] = useState("");
  const arr = ["Raj", "Mayank", "Ayush", "Raushan", "Anurag", "Rohit", "Akash", "Nikhil", "Shubham"]
  return (
    <>
    <ArrayCheckBox />
    <hr />
    <br /> <br /> 
    <SearchBar setValue={setNewVal} />
    <SearchResult value={newval} valuelist={arr} />
    <StudentDataSave />
    <hr />
    <br /> <br />
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
