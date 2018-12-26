package com.yoong.practice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("sc-provider")
public interface ICalculator {

    @RequestMapping("/calculator/add")
    Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);
}
