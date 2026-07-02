

function TimeTableCards({ from, to, subject }) {
	return (
		<div className="bg-white shadow-md rounded-lg p-4 m-4 border-2 w-64">
			<h3>{subject}</h3>
			<p>
				{from} - {to}
			</p>
			<button type="button" className="bg-green-600 text-amber-200 border-2 border-green-600 p-1 rounded-xl cursor-pointer">
				Take Class
			</button>
		</div>
	);
}

export default TimeTableCards;
