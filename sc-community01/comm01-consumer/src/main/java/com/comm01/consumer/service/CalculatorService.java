package com.comm01.consumer.service;

import com.comm01.consumer.hystrix.CalculatorServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "sc-provider", fallback = CalculatorServiceHystrix.class)
public interface CalculatorService {

    @RequestMapping("/calculator/add")
    Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);
}
