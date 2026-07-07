import { useState } from "react";
import DropDown from "./components/DropDown"
import WeatherInfoCard from "./components/WeatherInfoCard"

function App() {

  const [state, setState] = useState("");

  return (
    <>
    <DropDown state={state} setState={setState}/>
    <WeatherInfoCard state={state} />
    </>
  )
}

export default App
