package com.comm01.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
//@EnableFeignClients(basePackages = "com.yoong.practice.service")
public class Consumer {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Consumer Start...");
        SpringApplication.run(Consumer.class);
        System.out.println("Consumer Start Success");
    }
}
