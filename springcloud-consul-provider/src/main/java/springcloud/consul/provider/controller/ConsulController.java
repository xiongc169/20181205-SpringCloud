package springcloud.consul.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ConsulController {

    @Value("${server.port}")
    private String port;

    /**
     * http:127.0.0.1:8090/consul/getTime
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/consul/getTime")
    public String getTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String result = port + "  ConsulController.getTime()  " + format.format(new Date());
        return result;
    }
}
