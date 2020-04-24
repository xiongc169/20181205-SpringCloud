package springcloud.consul.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServiceController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 获取所有服务
     * http://127.0.0.1:8100/consulConsumer/services
     */
    @RequestMapping("/consulConsumer/services")
    public Object services() {
        return discoveryClient.getInstances("consul-provider");
    }

    /**
     * 从所有服务中选择一个服务（轮询）
     * http://127.0.0.1:8100/consulConsumer/discover
     */
    @RequestMapping("/consulConsumer/discover")
    public Object discover() {
        return loadBalancerClient.choose("consul-provider").getUri().toString();
    }

}
