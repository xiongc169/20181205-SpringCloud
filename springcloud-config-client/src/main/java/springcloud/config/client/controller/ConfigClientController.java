package springcloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfigClientController {

    @Value("${yoong.profile}")
    private String config;

    @RequestMapping("config/getConfig")
    public void getConfig() {
        System.out.println(config);
    }
}
