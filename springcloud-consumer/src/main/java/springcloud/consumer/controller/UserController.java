package springcloud.consumer.controller;

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
    public void addUser() {
        try {
            User user = template.getForObject("http://127.0.0.1:8085/user/get", User.class);
            System.out.println(user.getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
