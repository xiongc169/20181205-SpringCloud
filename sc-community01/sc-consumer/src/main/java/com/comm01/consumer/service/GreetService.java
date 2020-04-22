package com.comm01.consumer.service;

import com.comm01.facade.api.IGreet;
import com.comm01.consumer.hystrix.GreetServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "sc-provider", fallback = GreetServiceHystrix.class)
public interface GreetService extends IGreet {
}
