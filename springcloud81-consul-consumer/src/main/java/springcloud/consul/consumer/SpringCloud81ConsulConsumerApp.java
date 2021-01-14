package springcloud.consul.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringCloud81ConsulConsumerApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " SpringCloud81ConsulConsumerApp Start...");
        SpringApplication.run(SpringCloud81ConsulConsumerApp.class, args);
        System.out.println(sdFormat.format(new Date()) + " SpringCloud81ConsulConsumerApp Finished");
    }
}

