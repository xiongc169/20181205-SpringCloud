package springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableConfigServer
public class SpringCloud02ProviderApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " SpringCloud02ProviderApp Start...");
        SpringApplication.run(SpringCloud02ProviderApp.class, args);
        System.out.println(sdFormat.format(new Date()) + " SpringCloud02ProviderApp Finished");
    }
}
