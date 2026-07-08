import { useEffect, useState } from "react";

function FetchAPI() {
    const [data, setData] = useState([]);

    useEffect(() => {
        async function fetchData() {
            const response = await fetch(
                "https://662203b327fcd16fa6c87950.mockapi.io/api/v1/users"
            );

            const result = await response.json();

            setData(result);
        }

        fetchData();
    }, []);

    return ( 
        <>
        <div className="grid grid-cols-5 gap-2 bg-red-300">
        {data.map((user) => (
            <h2 key={user.id} className="hover:bg-blue-600 hover:animate-bounce cursor-pointer">{user.name}</h2>
        ))}
        </div>
        </>
     );
}

export default FetchAPI;