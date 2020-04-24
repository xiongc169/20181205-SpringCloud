package springcloud.consul.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringcloudConsulConsumerApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " SpringcloudConsulConsumerApp Start...");
        SpringApplication.run(SpringcloudConsulConsumerApp.class, args);
        System.out.println(sdFormat.format(new Date()) + " SpringcloudConsulConsumerApp Finished");
    }
}

