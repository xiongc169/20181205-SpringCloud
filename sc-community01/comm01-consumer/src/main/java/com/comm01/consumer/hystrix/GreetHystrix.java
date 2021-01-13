package com.comm01.consumer.hystrix;

import com.comm01.consumer.service.GreetService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class GreetHystrix implements GreetService {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    @Override
    @RequestMapping("/greet/sayHello")
    public String sayHello(@RequestParam(name = "name") String name) {
        String result = format.format(new Date()) + " GreetHystrix.sayHello: " + name;
        System.out.println(result);
        return result;
    }
}
