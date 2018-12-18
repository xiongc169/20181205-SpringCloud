package springcloud.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springcloud.consumer.hystrix.UserServiceHystrix;
import springcloud.consumer.model.User;

/**
 * 远程调用(Feign)
 */
@FeignClient(name = "springcloud-provider", fallback = UserServiceHystrix.class)
public interface IUserService {

    @RequestMapping("/user/get")
    User getUser(@RequestParam(name = "userId") Long userId);
}
