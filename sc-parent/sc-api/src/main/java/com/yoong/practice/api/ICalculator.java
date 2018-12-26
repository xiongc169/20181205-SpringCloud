package com.yoong.practice.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "sc-provider", fallback = CalculatorHystrix.class)
public interface ICalculator {

    @RequestMapping("/calculator/add")
    Integer add(Integer a, Integer b);
}
