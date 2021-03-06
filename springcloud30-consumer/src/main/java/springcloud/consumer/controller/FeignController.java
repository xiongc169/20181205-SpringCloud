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
public class FeignController {

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    @Autowired
    //@Qualifier("SPRINGCLOUD-PROVIDER")
    //@Qualifier("userServiceHystrix")
    private IUserService userService;

    /**
     * http://127.0.0.1:8020/consumer/get
     * 熔断监控： http://127.0.0.1:8020/hystrix
     */
    @ResponseBody
    @RequestMapping("/consumer/get")
    public User getUser() {
        User user = null;
        try {
            user = userService.getUser(6l);
            String result = format.format(new Date()) + " consumer\\ConsumerController.getUser(): " + user.getId() + " " + user.getName();
            System.out.println(result);

            String result1 = userService.getTime1();
            System.out.println(format.format(new Date()) + " " + result1);

            String result2 = userService.getTime2();
            System.out.println(format.format(new Date()) + " " + result2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return user;
    }
}
