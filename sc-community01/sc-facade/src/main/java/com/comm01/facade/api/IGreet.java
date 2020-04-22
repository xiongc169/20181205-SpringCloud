package com.comm01.facade.api;

import com.comm01.facade.hystrix.GreetHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "sc-provider", fallback = GreetHystrix.class)
public interface IGreet {

    @RequestMapping("/greet/sayHello")
    String sayHello(@RequestParam(name = "name") String name);
}
