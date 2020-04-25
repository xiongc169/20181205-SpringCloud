package springcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringcloudGatewayApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " SpringcloudGatewayApp Start...");
        SpringApplication.run(SpringcloudGatewayApp.class, args);
        System.out.println(sdFormat.format(new Date()) + " SpringcloudGatewayApp Finished");
    }

    /**
     * Spring Cloud Gateway 网关路由有两种配置方式：
     * 1、在配置文件 yml 中配置
     * 2、通过@Bean自定义 RouteLocator，在启动主类 Application 中配置
     * https://www.cnblogs.com/ityouknow/p/10141740.html
     */
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("path_route", r -> r.path("/getTime").uri("http://www.baidu.com"))
//                .build();
//    }

}

