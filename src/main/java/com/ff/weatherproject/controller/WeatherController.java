package com.ff.weatherproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ff.weatherproject.dto.WeatherResponse;
import com.ff.weatherproject.service.WeatherService;

@RestController
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/weather/Api/{cityName}")
	public ResponseEntity<WeatherResponse> getWeatherDetails(@PathVariable String cityName){
		return weatherService.getWeatherDetails(cityName);
	}
	

}
