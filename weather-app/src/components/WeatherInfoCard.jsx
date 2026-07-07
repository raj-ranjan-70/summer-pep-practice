import { useEffect, useState } from "react";

function WeatherInfoCard({ state }) {
  const url = "https://api.weatherapi.com/v1/current.json";
  const API_KEY = import.meta.env.VITE_API_KEY; // Replace with your API key

  const [weatherData, setWeatherData] = useState(null);

  useEffect(() => {
    if (!state) return;

    fetch(`${url}?key=${API_KEY}&q=${state}&aqi=yes`)
      .then((response) => response.json())
      .then((data) => {
        setWeatherData(data);
      })
      .catch((error) => {
        console.error("Error fetching weather:", error);
      });
  }, [state, API_KEY]);

  if (!weatherData) {
    return null;
  }

  return (
    <div className="max-w-5xl mx-auto mt-8 rounded-3xl bg-emerald-500 text-white shadow-2xl overflow-hidden">
      {/* Header */}
      <div className="flex flex-col md:flex-row justify-between items-center p-8 border-b border-emerald-400">
        <div>
          {/* <h2 className="text-4xl font-bold">
            {weatherData.location.name}
          </h2> */}

          <h2 className="text-4xl font-bold text-emerald-100 mt-1">
            {weatherData.location.region}, {weatherData.location.country}
          </h2>

          <p className="text-6xl font-extrabold mt-5">
            {weatherData.current.temp_c}°C
          </p>

          <p className="text-2xl mt-2 font-medium">
            {weatherData.current.condition.text}
          </p>
        </div>

        <img
          src={`https:${weatherData.current.condition.icon}`}
          alt={weatherData.current.condition.text}
          className="w-36 h-36 mt-6 md:mt-0"
        />
      </div>

      {/* Weather Details */}
      <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-5 p-8">

        <div className="bg-emerald-600 rounded-2xl p-5 shadow-lg">
          <p className="text-emerald-100">🌡️ Feels Like</p>
          <h3 className="text-3xl font-bold">
            {weatherData.current.feelslike_c}°C
          </h3>
        </div>

        <div className="bg-emerald-600 rounded-2xl p-5 shadow-lg">
          <p className="text-emerald-100">💧 Humidity</p>
          <h3 className="text-3xl font-bold">
            {weatherData.current.humidity}%
          </h3>
        </div>

        <div className="bg-emerald-600 rounded-2xl p-5 shadow-lg">
          <p className="text-emerald-100">💨 Wind Speed</p>
          <h3 className="text-3xl font-bold">
            {weatherData.current.wind_kph} km/h
          </h3>
        </div>

        <div className="bg-emerald-600 rounded-2xl p-5 shadow-lg">
          <p className="text-emerald-100">☀️ UV Index</p>
          <h3 className="text-3xl font-bold">
            {weatherData.current.uv}
          </h3>
        </div>

        <div className="bg-emerald-600 rounded-2xl p-5 shadow-lg">
          <p className="text-emerald-100">🌧️ Precipitation</p>
          <h3 className="text-3xl font-bold">
            {weatherData.current.precip_mm} mm
          </h3>
        </div>

        <div className="bg-emerald-600 rounded-2xl p-5 shadow-lg">
          <p className="text-emerald-100">🔥 Heat Index</p>
          <h3 className="text-3xl font-bold">
            {weatherData.current.heatindex_c}°C
          </h3>
        </div>

        <div className="bg-emerald-600 rounded-2xl p-5 shadow-lg">
          <p className="text-emerald-100">🌬️ Wind Direction</p>
          <h3 className="text-3xl font-bold">
            {weatherData.current.wind_dir}
          </h3>
        </div>

        <div className="bg-emerald-600 rounded-2xl p-5 shadow-lg">
          <p className="text-emerald-100">👁️ Visibility</p>
          <h3 className="text-3xl font-bold">
            {weatherData.current.vis_km} km
          </h3>
        </div>

        <div className="bg-emerald-600 rounded-2xl p-5 shadow-lg">
          <p className="text-emerald-100">🌡️ Pressure</p>
          <h3 className="text-3xl font-bold">
            {weatherData.current.pressure_mb} mb
          </h3>
        </div>

      </div>

      {/* Footer */}
      <div className="bg-emerald-700 text-center py-4 text-emerald-100">
        Last Updated: {weatherData.current.last_updated}
      </div>
    </div>
  );
}

export default WeatherInfoCard;