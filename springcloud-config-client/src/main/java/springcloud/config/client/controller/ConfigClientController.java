package springcloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope //使用@RefreshScope注解，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class ConfigClientController {

    @Value("${yoong.profile}")
    private String dev;

    //@Value("${profile}")
    //private String test;

    @ResponseBody
    @RequestMapping("/client/getConfig")
    public String getConfig() {
        System.out.println(dev);
        //System.out.println(test);
        return dev;
    }
}
