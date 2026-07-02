import { useState } from "react";
import Header from "./Header";
import TimeTableCards from "./TimeTableCards";

function Home() {
    const [timetableData, setTimetableData] = useState([
        { from: "10:00 AM", to: "11:00 AM", subject: "Ethics" },
        { from: "11:00 AM", to: "12:00 PM", subject: "MVC Programming" },
        { from: "12:00 PM", to: "01:00 PM", subject: "Combinatorial" },
        { from: "01:00 PM", to: "02:00 PM", subject: "Soft Skills" },
        { from: "03:00 PM", to: "04:00 PM", subject: "Informatica" },
        { from: "04:00 PM", to: "05:00 PM", subject: "CSE393" }
    ]);

    const [count, setCount] = useState(0);

    function incrementCount() {
        setCount(count + 1);
    }

    function addSlot() {
        const subject = prompt("Enter subject name:");
        const from = prompt("Enter start time (e.g., 10:00 AM):");
        const to = prompt("Enter end time (e.g., 11:00 AM):");

        if (!subject || !from || !to) {
            alert("All fields are required. Slot not added.");
            return;
        }

        setTimetableData([
            ...timetableData, 
            { from, to, subject }
        ]);
    }

    return (
        <>
            <Header />

            <div className="justify-items-center p-10 grid grid-cols-3">
                {timetableData.map((slot, index) => (
                    <TimeTableCards
                        key={index}
                        from={slot.from}
                        to={slot.to}
                        subject={slot.subject}
                    />
                ))}

                <button
                    type="button"
                    className="cursor-pointer bg-emerald-200 shadow-md rounded-lg p-4 m-4 border-2 w-64 text-3xl"
                    onClick={addSlot}
                >
                    ➕ Add Slot
                </button>
                <div className="text-2xl font-bold">
                    Count: {count}
                </div>
                <button
                    type="button"
                    className="cursor-pointer bg-emerald-200 shadow-md rounded-lg p-4 m-4 border-2 w-64 text-3xl"
                    onClick={incrementCount}
                >
                    ➕ Add Count
                </button>
            </div>
        </>
    );
}

export default Home;