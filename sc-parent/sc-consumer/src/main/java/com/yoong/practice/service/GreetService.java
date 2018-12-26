package com.yoong.practice.service;

import com.yoong.practice.api.IGreet;
import com.yoong.practice.hystrix.GreetServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "sc-provider", fallback = GreetServiceHystrix.class)
public interface GreetService extends IGreet {
}
