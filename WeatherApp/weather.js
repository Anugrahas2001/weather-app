let searchBtn = document.querySelector(".weather-button");
let inputField = document.querySelector(".weather-input");
let cityNameElement = document.querySelector(".name");
let temperatureElement = document.querySelector(".temperature");
let windElement = document.querySelector(".speed");
let humidityElement = document.querySelector(".humidity");

const apiKey = "a8fcdb494414d5665b41dbd580e5a2ae";

async function checkWeather() {
    const cityName = inputField.value;
    const url = `https://api.openweathermap.org/data/2.5/weather?units=metric&q=${cityName}&appid=${apiKey}`;

    const response = await fetch(url);
    var data = await response.json();
    console.log(data);
    cityNameElement.innerHTML = data.name;
    temperatureElement.innerHTML = Math.round(data.main.temp);
    windElement.innerHTML = data.wind.speed + "Km/hr";
    humidityElement.innerHTML = data.main.humidity + "%";
}

searchBtn.addEventListener("click", checkWeather);
