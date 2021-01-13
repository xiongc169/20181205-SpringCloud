package com.comm01.consumer.service;

import com.comm01.consumer.hystrix.WeatherHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "sc-provider", fallback = WeatherHystrix.class)
public interface WeatherService {

    @RequestMapping("/weather/get")
    String getWeather(@RequestParam(name = "input") String input);
}
