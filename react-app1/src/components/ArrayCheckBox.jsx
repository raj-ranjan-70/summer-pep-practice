import { useState } from "react";

function ArrayCheckBox() {
    const [count, setCount] = useState(0);
    const [headCount, setHeadCount] = useState(0);
    const [match, setMatch] = useState(null);
    const studentList = ["Raj", "Aman", "Priya", "Rahul", "Sneha", "Arjun", "Ananya", "Rohit", "Karan", 
                        "Neha", "Vikram", "Pooja", "Aditya", "Meera", "Siddharth", "Nisha", "Yash", "Kavya","Harsh", "Simran", "Ayush", "Riya", "Deepak", "Tanvi", "Manish"];
    function handleChange(e) {
        if(e.target.checked) {
            setCount(count => count + 1)
        }
        else {
            setCount(count => count - 1)
        }
    }
    function handleSubmit() {
        if(count === headCount) {
            setMatch(true)
        }
        else {
            setMatch(false)
        }
    }
    return ( 
        <>
        <h1 className="text-3xl text-center text-fuchsia-900 bold mb-2 p-2">Total Count: {count}</h1>
        <div className="grid grid-cols-5 gap-2 list-disc list-inside">
        {studentList.map((ele) => {
            return (<li className="flex"><input type="checkbox" name={ele}  onChange={(e) => handleChange(e)}
            className="cursor-pointer pr-2"/>
            <p className="pl-2">{ele}</p> </li>)
        })}
        </div>
        <div className="flex flex-col justify-center items-center mt-2 text-3xl text-center text-fuchsia-900 bold mb-2 p-2">
        <label htmlFor="count">Enter the Head Count: </label>
        <input type="number" id="count" className="border-2 text-center" 
        onChange={(e) => setHeadCount(Number(e.target.value))} 
        min={0} max={25}/>
        <button type="submit" className="border-2 m-2 p-2 cursor-pointer rounded-2xl"
        onClick={handleSubmit}>Submit</button> <br /> <hr />
        <p className={match === true ? "text-green-700" : "text-red-700"}>{match === null ? "" : match ? "Head Count Matched" : "Head Count Not Matched"}</p>
        </div>
        </>
     );
}

export default ArrayCheckBox;