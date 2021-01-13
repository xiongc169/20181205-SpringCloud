package com.comm01.consumer.hystrix;

import com.comm01.consumer.service.WeatherService;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class WeatherHystrix implements WeatherService {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    @Override
    public String getWeather(String input) {
        String weather = format.format(new Date()) + " WeatherHystrix.getWeather: " + input;
        System.out.println(weather);
        return weather;
    }
}
