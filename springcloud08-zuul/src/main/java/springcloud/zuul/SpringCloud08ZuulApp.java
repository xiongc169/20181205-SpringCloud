package springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloud08ZuulApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " SpringCloud08ZuulApp Start...");
        SpringApplication.run(SpringCloud08ZuulApp.class, args);
        System.out.println(sdFormat.format(new Date()) + " SpringCloud08ZuulApp Finished");
    }

}

