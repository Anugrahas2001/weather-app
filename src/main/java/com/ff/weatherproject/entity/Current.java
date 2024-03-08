package com.ff.weatherproject.entity;

import lombok.Data;

@Data
public class Current {
	private long last_updated_epoch;
	private String last_updated;
	private double temp_c;
	private double temp_f;
	private int is_day;
	private double wind_kph;
	   
    private int humidity;
  
    private int cloud;

}
