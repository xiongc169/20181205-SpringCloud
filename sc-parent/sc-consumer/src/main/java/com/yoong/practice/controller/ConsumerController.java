package com.yoong.practice.controller;

import com.yoong.practice.api.IGreet;
import com.yoong.practice.service.CalculatorService;
import com.yoong.practice.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConsumerController {

    @Autowired
    private CalculatorService calculatorService;

    @Autowired
    private GreetService greetService;

//    @Autowired
//    private IGreet greet;

    /**
     * http://localhost:8020/consumer/calculator
     */
    @ResponseBody
    @RequestMapping("/consumer/calculator")
    public Integer calculator() {
        Integer result = calculatorService.add(11, 22);
        System.out.println(result);
        return result;
    }

    /**
     * http://localhost:8020/consumer/sayHello
     */
    @ResponseBody
    @RequestMapping("/consumer/sayHello")
    public String sayHello() {
        //String result = greet.sayHello("Tony1");
        //System.out.println(result);
        String result = greetService.sayHello("Tony2");
        System.out.println(result);
        return result;
    }
}
