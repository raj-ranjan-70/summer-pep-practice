function SearchBar({setValue}) {
    return ( 
        <>
        <label htmlFor="searchbar">Search:</label>
        <input name="searchbar" type="search" onChange={(e) => {setValue(e.target.value)}} 
        className="border-2"/>
        </>
     );
}

export default SearchBar;