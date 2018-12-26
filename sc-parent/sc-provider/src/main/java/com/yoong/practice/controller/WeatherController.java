package com.yoong.practice.controller;

import com.yoong.practice.api.IWeather;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class WeatherController implements IWeather {

    private SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");

    @Override
    @ResponseBody
    @RequestMapping("/weather/get")
    public String getWeather(String input) {
        String weather = "WeatherController.getWeather: " + input + " ——" + format.format(new Date());
        System.out.println(weather);
        return weather;
    }
}
