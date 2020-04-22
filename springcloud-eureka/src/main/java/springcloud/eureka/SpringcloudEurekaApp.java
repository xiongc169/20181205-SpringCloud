package springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class SpringcloudEurekaApp {

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println("SpringcloudEurekaApp Start...");
        SpringApplication.run(SpringcloudEurekaApp.class, args);
        System.out.println("SpringcloudEurekaApp Finished");
    }
}
