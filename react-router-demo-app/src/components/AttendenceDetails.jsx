import { useState } from "react";

function AttendenceDetails() {
  const studentNames = [
    "Aarav Sharma",
    "Aditi Singh",
    "Akash Kumar",
    "Ananya Gupta",
    "Arjun Verma",
    "Ayush Mishra",
    "Bhavna Patel",
    "Deepak Yadav",
    "Divya Sharma",
    "Harsh Gupta",
    "Ishita Jain",
    "Karan Mehta",
    "Khushi Sharma",
    "Manav Singh",
    "Meera Patel",
    "Mohit Kumar",
    "Naina Verma",
    "Neha Gupta",
    "Nikhil Sharma",
    "Pooja Singh",
    "Pranav Kumar",
    "Priya Sharma",
    "Rahul Verma",
    "Raj Patel",
    "Riya Singh",
    "Rohan Gupta",
    "Sakshi Jain",
    "Sanjay Kumar",
    "Shivam Sharma",
    "Shruti Singh",
    "Simran Kaur",
    "Sneha Patel",
    "Sohan Gupta",
    "Sourav Kumar",
    "Tanvi Sharma",
    "Utkarsh Singh",
    "Vaibhav Jain",
    "Vansh Gupta",
    "Varun Kumar",
    "Vidhi Patel",
    "Vikas Sharma",
    "Yash Singh",
    "Yuvraj Verma",
    "Zoya Khan",
    "Adarsh Kumar",
    "Ankit Singh",
    "Chetan Patel",
    "Gaurav Sharma",
    "Komal Gupta",
    "Ritika Jain",
  ];

  const [presentStudents, setPresentStudents] = useState([]);
  const [submitted, setSubmitted] = useState(false);

  function handleCheckbox(name) {
    if (presentStudents.includes(name)) {
      setPresentStudents(
        presentStudents.filter((student) => student !== name)
      );
    } else {
      setPresentStudents([...presentStudents, name]);
    }
  }

  function handleSubmit(e) {
    e.preventDefault();
    setSubmitted(true);
  }

  const absentStudents = studentNames.filter(
    (student) => !presentStudents.includes(student)
  );

  return (
    <div className="min-h-screen bg-yellow-100 p-8">
      <div className="max-w-6xl mx-auto bg-white p-6 rounded shadow">

        <h1 className="text-3xl font-bold text-center text-blue-600 mb-6">
          Student Attendance
        </h1>

        <form onSubmit={handleSubmit}>

          <div className="grid grid-cols-2 md:grid-cols-3 lg:grid-cols-4 gap-3">

            {studentNames.map((student, index) => (
              <label
                key={index}
                className="flex items-center gap-2 border p-2 rounded bg-gray-100"
              >
                <input
                  type="checkbox"
                  checked={presentStudents.includes(student)}
                  onChange={() => handleCheckbox(student)}
                />

                <span>{student}</span>
              </label>
            ))}

          </div>

          <div className="text-center mt-6">
            <button
              className="bg-green-500 text-white px-6 py-2 rounded hover:bg-green-600"
            >
              Submit Attendance
            </button>
          </div>

        </form>

        {submitted && (
          <>
            <div className="mt-8 bg-blue-100 p-4 rounded">

              <h2 className="text-xl font-bold text-blue-700">
                Attendance Summary
              </h2>

              <p>Total Students : {studentNames.length}</p>
              <p className="text-green-700">
                Present : {presentStudents.length}
              </p>
              <p className="text-red-700">
                Absent : {absentStudents.length}
              </p>

            </div>

            <div className="grid md:grid-cols-2 gap-8 mt-8">

              <div className="bg-green-100 p-4 rounded">

                <h2 className="text-2xl font-bold text-green-700 mb-3">
                  Present Students
                </h2>

                <ul className="space-y-2">
                  {presentStudents.map((student, index) => (
                    <li key={index} className="border-b pb-1">
                      {student}
                    </li>
                  ))}
                </ul>

              </div>

              <div className="bg-red-100 p-4 rounded">

                <h2 className="text-2xl font-bold text-red-700 mb-3">
                  Absent Students
                </h2>

                <ul className="space-y-2">
                  {absentStudents.map((student, index) => (
                    <li key={index} className="border-b pb-1">
                      {student}
                    </li>
                  ))}
                </ul>

              </div>

            </div>
          </>
        )}

      </div>
    </div>
  );
}

export default AttendenceDetails;