import { useState } from "react";

function StudentDataSave() {
    const [value, setValue] = useState("");
    const [list, setList] = useState([]);
    const [editval, setEditVal] = useState(null);
    function handleClick() {
        if(!value) {
            return;
        }
        if(editval !== null) {
            const newlist = list.map(ele => {
                if(ele === editval) {
                    return value;
                }
                return ele;
            })
            setList(newlist);
            setEditVal(null);
        } else {
            setList([...list, value]);
        }
        setValue("");
    }
    function handleChange(e) {
        setValue(e.target.value);
    }
    function handleEdit(ele) {
        setValue(ele);
        setEditVal(ele);
    }
    function handleDelete(ele) {
        const newlist = list.filter(element => element != ele)
        setList(newlist)
    }
    return ( 
        <>
        <input type="text" onChange={(e) => handleChange(e)} value={value} className="border-2"/>
        <button type="submit" onClick={handleClick} className="border-2 m-2 p-2 cursor-pointer rounded-2xl">{(editval ? "Update" : "Save")}</button>

        <h1 className="text-3xl">Student List: </h1>
        <ul>
            {list.map((ele, idx) => (
                    <li key={idx} className="bg-green-400 text-black m-2" >{ele} 
                    <button type="submit" className="ml-2 bg-green-900 cursor-pointer m-2 p-2 text-amber-200 rounded-2xl" onClick={() => handleEdit(ele)}>Edit</button>
                    <button type="submit" className="ml-2 bg-red-900 cursor-pointer m-2 p-2 text-amber-200 rounded-2xl" onClick={() => handleDelete(ele)}>Delete</button></li>
            ))}
        </ul>
        </>
     );
}

export default StudentDataSave;