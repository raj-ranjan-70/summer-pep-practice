import { useState } from 'react';

function TaskManager() {
    const createUrl = "http://localhost:8080/api/tasks/create";
    const getUrl = "http://localhost:8080/api/tasks/get";
    const updateUrl = "http://localhost:8080/api/tasks/update";
    const deleteUrl = "http://localhost:8080/api/tasks/delete";

    const [id, setId] = useState("");
    const [title, setTitle] = useState("");
    const [description, setDescription] = useState("");

    const createTask = async (url) => {
        const response = await fetch(url, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ id, title, description }),
        });
        const data = await response.json();
        alert(data);
        setId("");
        setTitle("");
        setDescription("");
    }

    const getTask = async (url) => {
        const response = await fetch(url, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            },
        });
        const data = await response.json();
        console.log(data);
        setId("");
        setTitle("");
        setDescription("");
    }

    const updateTask = async (url) => {
        const response = await fetch(url, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ id, title, description }),
        });
        const data = await response.json();
        console.log(data);
        setId("");
        setTitle("");
        setDescription("");
    }

    const deleteTask = async (url) => {
        const response = await fetch(url, {
            method: 'DELETE',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ id, title, description })
        });
        const data = await response.json();
        console.log(data);
        setId("");
        setTitle("");
        setDescription("");
    }

    return ( 
        <>
        <label htmlFor="taskId">Task id:</label>
        <input type="text" id="taskId" name="taskId" value={id} onChange={(e) => setId(e.target.value)} 
        className="border-2 rounded-2xl m-2 p-2"/> <br />
        <label htmlFor="taskTitle">Task Title:</label>
        <input type="text" id="taskTitle" name="taskTitle" value={title} onChange={(e) => setTitle(e.target.value)} className="border-2 rounded-2xl m-2 p-2" /> <br />
        <label htmlFor="taskDescription">Task Description:</label>
        <input type="text" id="taskDescription" name="taskDescription" value={description} onChange={(e) => setDescription(e.target.value)} className="border-2 rounded-2xl m-2 p-2" /> <br />
        <button onClick={() => createTask(createUrl)}
            className="border-2 rounded-2xl m-2 p-2 cursor-pointer">Create Task</button>
        <button onClick={() => getTask(getUrl)}
            className="border-2 rounded-2xl m-2 p-2 cursor-pointer">Get Task</button>
        <button onClick={() => updateTask(updateUrl)}
            className="border-2 rounded-2xl m-2 p-2 cursor-pointer">Update Task</button>
        <button onClick={() => deleteTask(deleteUrl)}
            className="border-2 rounded-2xl m-2 p-2 cursor-pointer">Delete Task</button>
        </>
     );
}

export default TaskManager;