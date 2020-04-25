package springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class SpringcloudConfigServerApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " SpringcloudConfigServerApp Start...");
        SpringApplication.run(SpringcloudConfigServerApp.class, args);
        System.out.println(sdFormat.format(new Date()) + " SpringcloudConfigServerApp Finished");
    }

}

