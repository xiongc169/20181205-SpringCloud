package com.comm01.facade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Api {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Api Start...");
        SpringApplication.run(Api.class);
        System.out.println("Api Start Success");
    }
}
