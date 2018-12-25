package com.yoong.practice.service;

import com.yoong.practice.api.ICalculator;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name = "PROVIDER", fallback = CalculatorHystrixService.class)
@RequestMapping("/calculator")
public interface ICalculatorService extends ICalculator {

    @RequestMapping("/add")
    Integer add(Integer a, Integer b);

}
