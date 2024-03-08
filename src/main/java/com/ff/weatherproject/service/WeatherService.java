package com.ff.weatherproject.service;

import com.ff.weatherproject.dto.WeatherResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private static final String API_KEY = "a8fcdb494414d5665b41dbd580e5a2ae";
    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather?units=metric&q=";

    public ResponseEntity<WeatherResponse> getWeatherDetails(String cityName) {
        String apiUrl = API_URL + cityName + "&appid=" + API_KEY;
        RestTemplate restTemplate = new RestTemplate();
        WeatherResponse weatherResponse = restTemplate.getForObject(apiUrl, WeatherResponse.class);
        return ResponseEntity.ok(weatherResponse);
    }
}
