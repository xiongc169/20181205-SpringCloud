package springcloud.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springcloud.consumer.model.User;

@FeignClient(name = "springcloud-provider")
public interface IUserService {

    @RequestMapping("/user/get")
    User getUser(@RequestParam(name = "userId") Long userId);
}
