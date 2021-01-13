package com.comm01.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ProviderController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * http://127.0.0.1:8010/calculator/add?a=1&b=2
     */
    @ResponseBody
    @RequestMapping("/calculator/add")
    public Integer add(Integer a, Integer b) {
        Integer sum = a + b;
        System.out.println(format.format(new Date()) + " ProviderController.add");
        return sum;
    }

    /**
     * http://127.0.0.1:8010/greet/sayHello
     */
    @ResponseBody
    @RequestMapping("/greet/sayHello")
    public String sayHello(String name) {
        String greet = format.format(new Date()) + " ProviderController.sayHello: " + name;
        System.out.println(greet);
        return greet;
    }

}
