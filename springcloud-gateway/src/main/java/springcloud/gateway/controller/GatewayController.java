package springcloud.gateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class GatewayController {

    @ResponseBody
    @RequestMapping("/gateway/getTime")
    public String getTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String result = "GatewayController.getTime: " + format.format(new Date());
        System.out.println(result);
        return result;
    }
}
