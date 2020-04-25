package springcloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RefreshScope //使用@RefreshScope注解，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class ConfigClientController {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    @Value("${yoong.profile}")
    private String dev;

    //@Value("${profile}")
    //private String test;

    /**
     * http://127.0.0.1:8050/client/getConfig
     */
    @ResponseBody
    @RequestMapping("/client/getConfig")
    public String getConfig() {
        String result = sdFormat.format(new Date()) + " configClient\\ConfigClientController.getConfig()";
        System.out.println(dev);
        //System.out.println(test);
        System.out.println(result);
        return result;
    }
}
