package springcloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloud51ConfigClientApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " SpringCloud51ConfigClientApp Start...");
        SpringApplication.run(SpringCloud51ConfigClientApp.class, args);
        System.out.println(sdFormat.format(new Date()) + " SpringCloud51ConfigClientApp Finished");
    }
}

