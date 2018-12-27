package springcloud.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * http://127.0.0.1:8010/provider/getServices
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/getServices")
    public Object getServices() {
        List<String> services = discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
