package springcloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class SpringCloud71ZipkinApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " SpringCloud71ZipkinApp Start...");
        SpringApplication.run(SpringCloud71ZipkinApp.class, args);
        System.out.println(sdFormat.format(new Date()) + " SpringCloud71ZipkinApp Finished");
    }

}

