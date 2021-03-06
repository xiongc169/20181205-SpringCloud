package springcloud.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class SpringCloud40TurbineApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " SpringCloud40TurbineApp Start...");
        SpringApplication.run(SpringCloud40TurbineApp.class, args);
        System.out.println(sdFormat.format(new Date()) + " SpringCloud40TurbineApp Finished");
    }
}
