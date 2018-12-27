package springcloud.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import springcloud.consumer.model.User;

@Controller
public class UserController {

    @Autowired
    private RestTemplate template;

    @ResponseBody
    @RequestMapping("/user/get")
    @HystrixCommand(fallbackMethod = "getDefaultUser")
    public User addUser() {
        User user = null;
        try {
            user = template.getForObject("http://127.0.0.1:8010/user/get", User.class);
            System.out.println(user.getId() + " " + user.getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return user;
    }

    public User getDefaultUser() {
        return new User();
    }

}
