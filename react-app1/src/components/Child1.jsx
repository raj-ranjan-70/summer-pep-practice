function Child1({setValue}) {

    return ( 
        <>
        <label htmlFor="input-text">Enter the text: </label>
        <input id="input-text" type="text" onChange={(e) => setValue(e.target.value)} placeholder="Enter text..." 
        className="border-2 bg-amber-200"/>
        </>
     );
}

export default Child1;