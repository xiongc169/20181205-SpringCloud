package com.yoong.practice.controller;

import com.yoong.practice.service.ICalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConsumerController {

    @Autowired
    private ICalculator calculatorService;

    /**
     * http://localhost:8020/consumer/calculator
     */
    @RequestMapping("consumer/calculator")
    public void calculator() {
        Integer result = calculatorService.add(11, 22);
        System.out.println(result);
    }
}
