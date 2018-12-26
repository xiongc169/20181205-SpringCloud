package com.yoong.practice.hystrix;

import com.yoong.practice.service.CalculatorService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class CalculatorServiceHystrix implements CalculatorService {

    @Override
    @RequestMapping("/calculator/add")
    public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return 0;
    }
}
