package springcloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import springcloud.consumer.model.User;
import springcloud.consumer.service.IUserService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ConsumerController {

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    @Autowired
    //@Qualifier("SPRINGCLOUD-PROVIDER")
    //@Qualifier("userServiceHystrix")
    private IUserService userService;

    /**
     * http://127.0.0.1:8020/consumer/get
     */
    @ResponseBody
    @RequestMapping("/consumer/get")
    public User getUser() {
        User user = null;
        try {
            user = userService.getUser(6l);
            String result = format.format(new Date()) + " consumer\\ConsumerController.getUser(): " + user.getId() + " " + user.getName();
            System.out.println(result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return user;
    }
}
