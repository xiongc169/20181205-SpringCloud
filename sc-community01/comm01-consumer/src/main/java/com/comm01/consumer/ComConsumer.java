package com.comm01.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc ComConsumer
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-10-1
 * <p>
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
//@EnableFeignClients(basePackages = "com.yoong.practice.service")
public class ComConsumer {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " ComConsumer Start...");
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(ComConsumer.class, args);
        System.out.println(sdFormat.format(new Date()) + " ComConsumer Finished");
    }
}
