package com.comm01.consumer.hystrix;

import com.comm01.consumer.service.CalculatorService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class CalculatorHystrix implements CalculatorService {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    @Override
    @RequestMapping("/calculator/add")
    public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        System.out.println(format.format(new Date()) + " CalculatorHystrix.add");
        return 0;
    }
}
