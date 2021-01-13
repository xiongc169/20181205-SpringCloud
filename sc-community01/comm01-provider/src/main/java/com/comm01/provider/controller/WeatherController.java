package com.comm01.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class WeatherController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * http://127.0.0.1:8010/weather/get
     */
    @ResponseBody
    @RequestMapping("/weather/get")
    public String getWeather(String input) {
        String weather = format.format(new Date()) + " WeatherController.getWeather: " + input;
        System.out.println(weather);
        return weather;
    }
}
