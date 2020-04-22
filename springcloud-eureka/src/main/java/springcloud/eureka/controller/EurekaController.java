package springcloud.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/eureka")
public class EurekaController {

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * http://127.0.0.1:8761/eureka/getServices
     */
    @ResponseBody
    @RequestMapping("/getServices")
    public Object getServices() {
        List<String> services = discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
