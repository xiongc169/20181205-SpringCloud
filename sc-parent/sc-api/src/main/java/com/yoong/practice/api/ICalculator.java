package com.yoong.practice.api;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/calculator")
public interface ICalculator {

    @RequestMapping("/add")
    Integer add(Integer a, Integer b);
}
