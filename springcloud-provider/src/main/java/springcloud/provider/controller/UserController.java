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

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    @Autowired
    private IUserService userService;

    @Value("${server.port}")
    private String port;

    private SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMMddHHmmss");

    /**
     * http://127.0.0.1:8010/user/add
     */
    @ResponseBody
    @RequestMapping("/user/add")
    public void addUser() {
        try {
            User user = new User();
            user.setName("name-" + sdFormat.format(new Date()));
            user = userService.addUser(user);
            System.out.println(user.getId() + " " + user.getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * http://127.0.0.1:8010/user/get?userId=6
     */
    @ResponseBody
    @RequestMapping("/user/get")
    public User getUser(Long userId) {
        try {
            User user = userService.getUser(userId);
            String result = format.format(new Date()) + " provider\\UserController.getUser(): " + port + " " + user.getId() + " " + user.getName();
            System.out.println(result);
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    /**
     * http://127.0.0.1:8010/user/getTime
     */
    @ResponseBody
    @RequestMapping("/user/getTime")
    public String getTime1() {
        try {
            String result = format.format(new Date()) + " provider\\UserController.getTime1(): ";
            System.out.println(result);
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    /**
     * http://127.0.0.1:8010/getTime
     */
    @ResponseBody
    @RequestMapping("/getTime")
    public String getTime2() {
        try {
            String result = format.format(new Date()) + " provider\\UserController.getTime2(): ";
            System.out.println(result);
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
