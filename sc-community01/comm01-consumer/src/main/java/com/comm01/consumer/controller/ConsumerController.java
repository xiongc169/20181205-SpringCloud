package com.comm01.consumer.controller;

import com.comm01.facade.api.IWeather;
import com.comm01.consumer.service.CalculatorService;
import com.comm01.consumer.service.GreetService;
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

    @Autowired
    private IWeather weather;

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

    /**
     * http://localhost:8020/consumer/getWeather
     */
    @ResponseBody
    @RequestMapping("/consumer/getWeather")
    public String getWeather() {
        String result = weather.getWeather("Today");
        System.out.println(result);
        return result;
    }
}
