package com.yoong.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ProviderController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");

    @ResponseBody
    @RequestMapping("/calculator/add")
    public Integer add(Integer a, Integer b) {
        Integer sum = a + b;
        return sum;
    }

    @ResponseBody
    @RequestMapping("/greet/sayHello")
    public String sayHello(String name) {
        String greet = "ProviderController.sayHello: " + name + " ——" + format.format(new Date());
        return greet;
    }

}
