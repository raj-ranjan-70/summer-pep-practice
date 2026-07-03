function SearchResult({value, valuelist}) {
    const filteredlist = valuelist.filter((ele) => {
        return ele.includes(value)
    })
    return ( 
        <>
        <h1>Search Results: </h1>
        <ul>
            {filteredlist.map((ele) => {
                return <li key={ele}>{ele}</li>
            })}
        </ul>
        </>
     );
}

export default SearchResult;