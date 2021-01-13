package com.comm01.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc ComEureka
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-10-1
 * <p>
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class ComEureka {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " ComEureka Start...");
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(ComEureka.class, args);
        System.out.println(sdFormat.format(new Date()) + " ComEureka Finished");
    }

}
