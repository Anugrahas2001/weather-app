package com.ff.weatherproject.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.ff.weatherproject.entity.Condition;
import com.ff.weatherproject.entity.Current;
import com.ff.weatherproject.entity.Location;

import lombok.Data;
import lombok.Getter;

@Data
public class WeatherResponse {

    @Autowired
    private Location location;
    @Autowired
    private Condition condition;
    @Autowired
    private Current current;

   
    
    
    
}
