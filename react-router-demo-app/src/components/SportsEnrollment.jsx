import { useState } from "react";

function SportsEnrollment() {
  const [formData, setFormData] = useState({
    name: "",
    email: "",
    age: "",
    gender: "",
    sport: "",
    phone: "",
    department: "",
    year: "",
  });

  const [enrollments, setEnrollments] = useState([]);

  function handleChange(e) {
    const { name, value } = e.target;

    setFormData({
      ...formData,
      [name]: value,
    });
  }

  function handleSubmit(e) {
    e.preventDefault();

    setEnrollments([...enrollments, formData]);

    setFormData({
      name: "",
      email: "",
      age: "",
      gender: "",
      sport: "",
      phone: "",
      department: "",
      year: "",
    });
  }

  return (
    <div className="min-h-screen bg-yellow-100 p-8">
      <div className="max-w-5xl mx-auto bg-white shadow rounded p-6">

        <h1 className="text-3xl font-bold text-center text-blue-600 mb-6">
          Sports Enrollment Form
        </h1>

        <form
          onSubmit={handleSubmit}
          className="grid grid-cols-2 gap-4"
        >

          <div>
            <label className="block mb-1 font-semibold">
              Name
            </label>

            <input
              type="text"
              name="name"
              value={formData.name}
              onChange={handleChange}
              className="w-full border p-2 rounded"
            />
          </div>

          <div>
            <label className="block mb-1 font-semibold">
              Email
            </label>

            <input
              type="email"
              name="email"
              value={formData.email}
              onChange={handleChange}
              className="w-full border p-2 rounded"
            />
          </div>

          <div>
            <label className="block mb-1 font-semibold">
              Age
            </label>

            <input
              type="number"
              name="age"
              value={formData.age}
              onChange={handleChange}
              className="w-full border p-2 rounded"
            />
          </div>

          <div>
            <label className="block mb-1 font-semibold">
              Gender
            </label>

            <select
              name="gender"
              value={formData.gender}
              onChange={handleChange}
              className="w-full border p-2 rounded"
            >
              <option value="">Select Gender</option>
              <option>Male</option>
              <option>Female</option>
            </select>
          </div>

          <div>
            <label className="block mb-1 font-semibold">
              Sport
            </label>

            <select
              name="sport"
              value={formData.sport}
              onChange={handleChange}
              className="w-full border p-2 rounded"
            >
              <option value="">Select Sport</option>
              <option>Cricket</option>
              <option>Football</option>
              <option>Basketball</option>
              <option>Volleyball</option>
              <option>Badminton</option>
              <option>Chess</option>
              <option>Tennis</option>
            </select>
          </div>

          <div>
            <label className="block mb-1 font-semibold">
              Phone Number
            </label>

            <input
              type="text"
              name="phone"
              value={formData.phone}
              onChange={handleChange}
              className="w-full border p-2 rounded"
            />
          </div>

          <div>
            <label className="block mb-1 font-semibold">
              Department
            </label>

            <input
              type="text"
              name="department"
              value={formData.department}
              onChange={handleChange}
              className="w-full border p-2 rounded"
            />
          </div>

          <div>
            <label className="block mb-1 font-semibold">
              Year
            </label>

            <select
              name="year"
              value={formData.year}
              onChange={handleChange}
              className="w-full border p-2 rounded"
            >
              <option value="">Select Year</option>
              <option>1st Year</option>
              <option>2nd Year</option>
              <option>3rd Year</option>
              <option>4th Year</option>
            </select>
          </div>

          <div className="col-span-2 text-center mt-2">
            <button
              type="submit"
              className="bg-green-500 text-white px-6 py-2 rounded hover:bg-green-600"
            >
              Enroll Student
            </button>
          </div>

        </form>

        {enrollments.length > 0 && (
          <div className="mt-10">

            <h2 className="text-2xl font-bold text-red-600 mb-4">
              Enrolled Students
            </h2>

            <div className="space-y-4">

              {enrollments.map((student, index) => (
                <div
                  key={index}
                  className="border rounded p-4 bg-blue-50"
                >

                  <p>
                    <span className="font-semibold">Name:</span>{" "}
                    {student.name}
                  </p>

                  <p>
                    <span className="font-semibold">Email:</span>{" "}
                    {student.email}
                  </p>

                  <p>
                    <span className="font-semibold">Age:</span>{" "}
                    {student.age}
                  </p>

                  <p>
                    <span className="font-semibold">Gender:</span>{" "}
                    {student.gender}
                  </p>

                  <p>
                    <span className="font-semibold">Sport:</span>{" "}
                    {student.sport}
                  </p>

                  <p>
                    <span className="font-semibold">Phone:</span>{" "}
                    {student.phone}
                  </p>

                  <p>
                    <span className="font-semibold">Department:</span>{" "}
                    {student.department}
                  </p>

                  <p>
                    <span className="font-semibold">Year:</span>{" "}
                    {student.year}
                  </p>

                </div>
              ))}

            </div>

          </div>
        )}

      </div>
    </div>
  );
}

export default SportsEnrollment;