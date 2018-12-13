package springcloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudConfigClientApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigClientApp.class, args);
    }

}

