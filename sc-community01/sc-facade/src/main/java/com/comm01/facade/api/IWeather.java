package com.comm01.facade.api;

import com.comm01.facade.hystrix.WeatherHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "sc-provider", fallback = WeatherHystrix.class)
public interface IWeather {

    @RequestMapping("/weather/get")
    String getWeather(@RequestParam(name = "input") String input);
}