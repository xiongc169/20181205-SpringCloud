package springcloud.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springcloud.provider.model.User;
import springcloud.provider.service.IUserService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @Value("${server.port}")
    private String port;

    @ResponseBody
    @RequestMapping("/user/add")
    public void addUser() {
        try {
            User user = new User();
            user.setName("name-" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
            user = userService.addUser(user);
            System.out.println(user.getId() + " " + user.getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @ResponseBody
    @RequestMapping("/user/get")
    public User getUser(Long userId) {
        try {
            userId = 1l;
            User user = userService.getUser(userId);
            System.out.println(port + " " + user.getId() + " " + user.getName());
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
