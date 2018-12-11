package springcloud.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springcloud.provider.model.User;
import springcloud.provider.service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/user/add")
    public void addUser() {
        try {
            User user = new User();
            user.setName("name-" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
            user = userService.addUser(user);
            System.out.println(user.getId());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @ResponseBody
    @RequestMapping("/user/get")
    public User getUser() {
        try {
            Long userId = 1l;
            User user = userService.getUser(userId);
            System.out.println(user.getId());
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
