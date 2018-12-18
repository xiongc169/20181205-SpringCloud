package springcloud.config.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ConfigServerController {

    @ResponseBody
    @RequestMapping("/server/setConfig")
    public String getConfig() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String now = format.format(new Date());
        return now;
    }
}
