import { useState } from "react";

function StudentDataSave() {
    const [value, setValue] = useState("");
    const [list, setList] = useState([]);
    function handleClick() {
        if(!value) {
            return;
        }
        setList([...list, value])
        setValue("");
    }
    function handleChange(e) {
        setValue(e.target.value);
    }
    function handleDelete(ele) {
        const newlist = list.filter(element => element != ele)
        setList(newlist)
    }
    return ( 
        <>
        <input type="text" onChange={(e) => handleChange(e)} value={value} className="border-2"/>
        <button type="submit" onClick={handleClick} className="border-2 m-2 p-2 cursor-pointer rounded-2xl">Save</button>

        <h1>Student List: </h1>
        <ul>
            {list.map((ele, idx) => (
                    <li key={idx} className="bg-green-400 text-blue-900 m-2" >{ele} <button type="submit" className="ml-2 bg-red-900 cursor-pointer m-2 p-2 text-amber-200 rounded-2xl" onClick={() => handleDelete(ele)}>Delete</button></li>
            ))}
        </ul>
        </>
     );
}

export default StudentDataSave;