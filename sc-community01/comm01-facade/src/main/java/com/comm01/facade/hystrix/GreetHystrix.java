package com.comm01.facade.hystrix;


import com.comm01.facade.api.IGreet;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class GreetHystrix implements IGreet {

    @Override
    @RequestMapping("/greet/sayHello")
    public String sayHello(@RequestParam(name = "name") String name) {
        String result = " GreetHystrix.sayHello: " + name;
        return result;
    }
}
