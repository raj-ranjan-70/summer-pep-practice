import { useState } from "react";

function FeedbackForm() {
  const [formData, setFormData] = useState({
    name: "",
    email: "",
    course: "",
    rating: "",
    recommendation: "",
    feedback: "",
  });

  const [feedbacks, setFeedbacks] = useState([]);

  function handleChange(e) {
    const { name, value } = e.target;

    setFormData({
      ...formData,
      [name]: value,
    });
  }

  function handleSubmit(e) {
    e.preventDefault();

    setFeedbacks([...feedbacks, formData]);

    setFormData({
      name: "",
      email: "",
      course: "",
      rating: "",
      recommendation: "",
      feedback: "",
    });
  }

  return (
    <div className="min-h-screen bg-yellow-100 p-8">
      <div className="max-w-5xl mx-auto bg-white p-6 rounded shadow">

        <h1 className="text-3xl font-bold text-center text-blue-600 mb-6">
          Student Feedback Form
        </h1>

        <form
          onSubmit={handleSubmit}
          className="grid grid-cols-2 gap-4"
        >

          <div>
            <label className="block font-semibold mb-1">
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
            <label className="block font-semibold mb-1">
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
            <label className="block font-semibold mb-1">
              Course
            </label>

            <select
              name="course"
              value={formData.course}
              onChange={handleChange}
              className="w-full border p-2 rounded"
            >
              <option value="">Select Course</option>
              <option>React JS</option>
              <option>Java</option>
              <option>Python</option>
              <option>DBMS</option>
              <option>Operating System</option>
            </select>
          </div>

          <div>
            <label className="block font-semibold mb-1">
              Rating
            </label>

            <select
              name="rating"
              value={formData.rating}
              onChange={handleChange}
              className="w-full border p-2 rounded"
            >
              <option value="">Select Rating</option>
              <option>1 Star</option>
              <option>2 Stars</option>
              <option>3 Stars</option>
              <option>4 Stars</option>
              <option>5 Stars</option>
            </select>
          </div>

          <div className="col-span-2">
            <label className="block font-semibold mb-1">
              Would you recommend this course?
            </label>

            <div className="flex gap-6 mt-2">
              <label>
                <input
                  type="radio"
                  name="recommendation"
                  value="Yes"
                  checked={formData.recommendation === "Yes"}
                  onChange={handleChange}
                />
                <span className="ml-2">Yes</span>
              </label>

              <label>
                <input
                  type="radio"
                  name="recommendation"
                  value="No"
                  checked={formData.recommendation === "No"}
                  onChange={handleChange}
                />
                <span className="ml-2">No</span>
              </label>
            </div>
          </div>

          <div className="col-span-2">
            <label className="block font-semibold mb-1">
              Feedback
            </label>

            <textarea
              name="feedback"
              rows="4"
              value={formData.feedback}
              onChange={handleChange}
              className="w-full border p-2 rounded"
            ></textarea>
          </div>

          <div className="col-span-2 text-center">
            <button
              type="submit"
              className="bg-green-500 text-white px-6 py-2 rounded hover:bg-green-600"
            >
              Submit Feedback
            </button>
          </div>

        </form>

        {feedbacks.length > 0 && (
          <div className="mt-10">

            <h2 className="text-2xl font-bold text-red-600 mb-4">
              Submitted Feedback
            </h2>

            <div className="space-y-4">

              {feedbacks.map((item, index) => (
                <div
                  key={index}
                  className="bg-blue-100 border rounded p-4"
                >
                  <p><strong>Name:</strong> {item.name}</p>
                  <p><strong>Email:</strong> {item.email}</p>
                  <p><strong>Course:</strong> {item.course}</p>
                  <p><strong>Rating:</strong> {item.rating}</p>
                  <p><strong>Recommendation:</strong> {item.recommendation}</p>
                  <p><strong>Feedback:</strong> {item.feedback}</p>
                </div>
              ))}

            </div>

          </div>
        )}

      </div>
    </div>
  );
}

export default FeedbackForm;