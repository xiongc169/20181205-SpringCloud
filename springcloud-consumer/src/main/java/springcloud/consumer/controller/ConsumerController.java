package springcloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import springcloud.consumer.model.User;
import springcloud.consumer.service.IUserService;

@Controller
public class ConsumerController {

    @Autowired
    //@Qualifier("SPRINGCLOUD-PROVIDER")
    //@Qualifier("userServiceHystrix")
    private IUserService userService;

    /**
     * http://127.0.0.1:8020/consumer/get
     */
    @ResponseBody
    @RequestMapping("/consumer/get")
    public User addUser() {
        User user = null;
        try {
            user = userService.getUser(6l);
            System.out.println("【Consumer】 " + user.getId() + " " + user.getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return user;
    }
}
