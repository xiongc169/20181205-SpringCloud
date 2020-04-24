package springcloud.consul.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ConsulProviderController {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    @Value("${server.port}")
    private String port;

    /**
     * http://127.0.0.1:8090/consul/getTime
     */
    @ResponseBody
    @RequestMapping("/consul/getTime")
    public String getTime() {
        String result = sdFormat.format(new Date()) + " " + port + "  consulProvider\\ConsulProviderController.getTime()";
        System.out.println(result);
        return result;
    }
}
