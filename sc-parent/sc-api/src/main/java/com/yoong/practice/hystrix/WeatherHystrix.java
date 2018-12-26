package com.yoong.practice.hystrix;

import com.yoong.practice.api.IWeather;
import org.springframework.stereotype.Component;

@Component
public class WeatherHystrix implements IWeather {

    @Override
    public String getWeather(String input) {
        String msg = "Nothing";
        return msg;
    }
}
