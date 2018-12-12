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
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/consumer/get")
    public void addUser() {
        try {
            User user = userService.getUser(2l);
            System.out.println("Consumer " + user.getId() + " " + user.getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
