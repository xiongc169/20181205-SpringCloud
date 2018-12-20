package springcloud.consul.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class CallController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * http:127.0.0.1:8100/consulConsumer/call
     *
     * @return
     */
    @RequestMapping("/consulConsumer/call")
    public String call() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("springcloud-consul-service");
        System.out.println("服务地址：" + serviceInstance.getUri());
        System.out.println("服务名称：" + serviceInstance.getServiceId());

        String callServiceResult = new RestTemplate().getForObject(serviceInstance.getUri().toString() + "/consul/getTime", String.class);
        System.out.println(callServiceResult);
        return callServiceResult;
    }
}
