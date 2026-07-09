import AttendenceDetails from './components/AttendenceDetails'
import SportsEnrollment from './components/SportsEnrollment'
import FeedbackForm from './components/FeedbackForm'
import HomePage from './components/HomePage'
import Navbar from './components/Navbar'
import { Routes, Route } from 'react-router-dom'

function App() {
  return (
    <div className="min-h-screen bg-yellow-50 text-slate-900">
      <Navbar />

      <main className="mx-auto max-w-6xl px-4 py-8 sm:px-6 lg:px-8">
        <Routes>
          <Route path="/" element={<HomePage />} />
          <Route path="/attendance" element={<AttendenceDetails />} />
          <Route path="/sports" element={<SportsEnrollment />} />
          <Route path="/feedback" element={<FeedbackForm />} />
        </Routes>
      </main>
    </div>
  )
}

export default App;