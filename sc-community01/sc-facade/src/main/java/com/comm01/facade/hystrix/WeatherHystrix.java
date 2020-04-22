package com.comm01.facade.hystrix;

import com.comm01.facade.api.IWeather;
import org.springframework.stereotype.Component;

@Component
public class WeatherHystrix implements IWeather {

    @Override
    public String getWeather(String input) {
        String msg = "Nothing";
        return msg;
    }
}
