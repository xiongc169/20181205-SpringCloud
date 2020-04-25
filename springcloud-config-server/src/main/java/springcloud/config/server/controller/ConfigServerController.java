package springcloud.config.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ConfigServerController {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * http://127.0.0.1:8040/server/setConfig
     */
    @ResponseBody
    @RequestMapping("/server/setConfig")
    public String getConfig() {
        String result = sdFormat.format(new Date()) + " configServer\\ConfigServerController.getConfig()";
        System.out.println(result);
        return result;
    }
}
