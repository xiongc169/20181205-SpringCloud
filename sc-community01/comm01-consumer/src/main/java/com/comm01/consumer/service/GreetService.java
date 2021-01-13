package com.comm01.consumer.service;

import com.comm01.consumer.hystrix.GreetHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "sc-provider", fallback = GreetHystrix.class)
public interface GreetService {

    @RequestMapping("/greet/sayHello")
    String sayHello(String name);
}
