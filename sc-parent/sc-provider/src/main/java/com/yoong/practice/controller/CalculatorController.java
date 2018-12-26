package com.yoong.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {

    @ResponseBody
    @RequestMapping("/calculator/add")
    public Integer add(Integer a, Integer b) {
        Integer sum = a + b;
        return sum;
    }
}
