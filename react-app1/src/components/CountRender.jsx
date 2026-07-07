import { useEffect, useState } from "react";

function CountRender() {
    const [count, setCount] = useState(0);
    useEffect(() => {
        console.log('Render ' + count);
        fetch('https://jsonplaceholder.typicode.com/posts/' + count)
        .then((response) => response.json())
        .then((json) => console.log(json));
    }, [count]);
    return ( 
        <>
        <h1 className="font-bold text-3xl">Count: {count}</h1>
        <button type="submit" 
        className="border-2 m-1.5 p-1.5 cursor-pointer rounded-2xl"
        onClick={() => setCount(count => count + 1)}>Click Me</button>
        </>
     );
}

export default CountRender;