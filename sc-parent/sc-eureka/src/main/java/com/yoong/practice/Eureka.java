package com.yoong.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Eureka Start...");
        SpringApplication.run(Eureka.class);
        System.out.println("Eureka Start Success");
    }
}
