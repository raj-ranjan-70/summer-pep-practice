function HomePage() {
    return ( 
        <section className="mx-auto flex min-h-[calc(100vh-10rem)] max-w-3xl flex-col items-center justify-start px-4 pt-10 text-center sm:pt-16">
            <h1 className="text-4xl font-bold text-blue-600 sm:text-5xl">
                Welcome to the Student Portal
            </h1>
            <p className="mt-6 max-w-2xl text-lg leading-8 text-gray-700 sm:text-xl">
                This is the home page of the student portal. Here you can find information about your attendance, sports activities, and provide feedback.
            </p>
        </section>
     );
}

export default HomePage;