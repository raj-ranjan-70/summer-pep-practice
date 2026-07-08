import { useState } from "react";

function InputForm() {
    const [form, setForm] = useState({
        name: "",
        email: "",
        pass: ""
    });

    const [showVal, setShowVal] = useState(false);

    async function handleClick(e) {
        e.preventDefault();

        const response = await fetch(url,
            {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({
                    name: form.name, 
                    email: form.email,
                    password: form.pass,
                }),
            }
        );

        // const result = await response.json();

        console.log(response.status);

        if(response.status === 201 || response.status === 204) {
            alert("Form Submitted Successfully");
        }
        else {
            alert("Form Submission Failed, Please try again...");
        }

        setShowVal(true);
    }

    function handleClear() {
        setForm({
            name: "",
            email: "",
            pass: ""
        });
        setShowVal(false);
    }

    const url = "https://662203b327fcd16fa6c87950.mockapi.io/api/v1/users";
    return (
        <div className="min-h-screen flex justify-center items-center bg-cyan-200">

            <div className="bg-white p-6 border w-96">

                <h1 className="text-2xl font-bold text-center mb-6">
                    Login Form
                </h1>

                <form onSubmit={handleClick} action={url} method="POST">

                    <label htmlFor="name" className="font-semibold">
                        Name
                    </label>
                    <input
                        type="text"
                        id="name"
                        name="name"
                        value={form.name}
                        onChange={(e) =>
                            setForm({ ...form, name: e.target.value })
                        }
                        className="border w-full p-2 mt-1 mb-4"
                        placeholder="Enter your name"
                        required
                    />

                    <label htmlFor="email" className="font-semibold">
                        Email
                    </label>
                    <input
                        type="email"
                        id="email"
                        name="email"
                        value={form.email}
                        onChange={(e) =>
                            setForm({ ...form, email: e.target.value })
                        }
                        className="border w-full p-2 mt-1 mb-4"
                        placeholder="Enter your email"
                        required
                    />

                    <label htmlFor="password" className="font-semibold">
                        Password
                    </label>
                    <input
                        type="password"
                        id="password"
                        name="password"
                        value={form.pass}
                        onChange={(e) =>
                            setForm({ ...form, pass: e.target.value })
                        }
                        className="border w-full p-2 mt-1 mb-4"
                        placeholder="Enter your password"
                        required
                    />

                    <div className="flex gap-3">
                        <button
                            type="submit"
                            className=" text-emerald-950 px-4 py-2 cursor-pointer
                            hover:bg-cyan-900 hover:text-amber-300 border-2 border-teal-400 hover:animate-spin"
                        >
                            Login
                        </button>

                        <button
                            type="button"
                            onClick={handleClear}
                            className="border-green-900 text-green-900 border-2 hover:bg-green-400 px-4 py-2 cursor-pointer hover:text-white hover:animate-spin"
                        >
                            Clear
                        </button>
                    </div>

                </form>

                {showVal && (
                    <div className="mt-6 p-4 border bg-gray-100">
                        <h2 className="font-bold text-lg mb-2">
                            Form Data
                        </h2>

                        <p><b>Name:</b> {form.name}</p>
                        <p><b>Email:</b> {form.email}</p>
                        <p><b>Password:</b> {form.pass}</p>
                    </div>
                )}

            </div>

        </div>
    );
}

export default InputForm;