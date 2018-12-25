package com.yoong.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider {
    public static void main(String[] args) {
        System.out.println("Hello World 1");
        SpringApplication.run(Provider.class);
        System.out.println("Hello World 2");
    }
}
