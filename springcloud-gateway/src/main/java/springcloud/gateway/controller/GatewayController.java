package springcloud.gateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class GatewayController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    @ResponseBody
    @RequestMapping("/gateway/getTime")
    public String getTime() {
        String result = format.format(new Date()) + " gateway\\GatewayController.getTime()";
        System.out.println(result);
        return result;
    }
}
