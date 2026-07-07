function DropDown({state, setState}) {

  const indianStates = [
    "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar",
    "Chhattisgarh", "Goa", "Gujarat", "Haryana",
    "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala",
    "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya",
    "Mizoram", "Nagaland", "Odisha", "Punjab",
    "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana",
    "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"
  ];

  return (
    <>
      <label htmlFor="states">Choose a state:</label>

      <select
        id="states"
        value={state}
        onChange={(e) => setState(e.target.value)}
        className="border-2 m-2 p-1.5"
      >
        <option value="">Select a state</option>

        {indianStates.map((stateName, idx) => (
          <option key={idx} value={stateName}>
            {stateName}
          </option>
        ))}
      </select>
    </>
  );
}

export default DropDown;