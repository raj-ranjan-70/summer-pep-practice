import { Link } from "react-router-dom";

function Navbar() {
    return (
        <nav className="bg-yellow-100 shadow-md border-b-2 border-blue-500">
            <div className="mx-auto flex w-full max-w-7xl items-center justify-between px-4 py-4 sm:px-6 lg:px-8">
                <h1 className="text-2xl font-bold text-blue-600">
                    Student Portal
                </h1>

                <ul className="flex gap-8 font-semibold">
                    <li>
                        <Link
                            to="/attendance"
                            className="text-blue-600 hover:text-green-600 hover:underline"
                        >
                            Attendance
                        </Link>
                    </li>

                    <li>
                        <Link
                            to="/sports"
                            className="text-blue-600 hover:text-green-600 hover:underline"
                        >
                            Sports
                        </Link>
                    </li>

                    <li>
                        <Link
                            to="/feedback"
                            className="text-blue-600 hover:text-red-600 hover:underline"
                        >
                            Feedback
                        </Link>
                    </li>
                </ul>
            </div>
        </nav>
    );
}

export default Navbar;