package springcloud.consumer.hystrix;

import org.springframework.stereotype.Component;
import springcloud.consumer.model.User;
import springcloud.consumer.service.IUserService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 熔断组件
 */
@Component
public class UserServiceHystrix implements IUserService {

    private SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMMddHHmmss");

    @Override
    public User getUser(Long userId) {
        User user = new User();
        user.setId(userId);
        user.setName("From UserServiceHystrix " + sdFormat.format(new Date()));
        return user;
    }
}
