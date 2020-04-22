package com.comm01.consumer.hystrix;


import com.comm01.consumer.service.GreetService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class GreetServiceHystrix implements GreetService {

    @Override
    @RequestMapping("/greet/sayHello")
    public String sayHello(@RequestParam(name = "name") String name) {
        String result = " GreetHystrix.sayHello: " + name;
        return result;
    }
}