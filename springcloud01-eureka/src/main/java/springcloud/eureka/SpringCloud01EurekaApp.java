package springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class SpringCloud01EurekaApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " SpringCloud01EurekaApp Start...");
        SpringApplication.run(SpringCloud01EurekaApp.class, args);
        System.out.println(sdFormat.format(new Date()) + " SpringCloud01EurekaApp Finished");
    }
}
