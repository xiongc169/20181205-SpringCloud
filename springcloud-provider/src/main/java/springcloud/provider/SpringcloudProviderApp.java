package springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableConfigServer
public class SpringcloudProviderApp {

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println("SpringcloudProviderApp Start...");
        SpringApplication.run(SpringcloudProviderApp.class, args);
        System.out.println("SpringcloudProviderApp Finished");
    }
}
