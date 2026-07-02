import { useState } from "react";

function Counter() {
    const [count, setCount] = useState(0);
    const [value, setValue] = useState("");
    return ( 
        <>
            <div>
                Count: {count}
            </div>
            <button
                type="button"
                onClick={() => setCount(count + 1)}
                className="border-2 p-1 m-2 cursor-pointer hover:bg-blue-700"
            >
                ➕ Add Count
            </button>  

            <h1>Text: {value}</h1>

            <input type="text" onChange={(e) => {setValue(e.target.value)}} 
            className="border-2 bg-blue-200"
            placeholder="Enter the text"/>
        </>
     );
}

export default Counter;