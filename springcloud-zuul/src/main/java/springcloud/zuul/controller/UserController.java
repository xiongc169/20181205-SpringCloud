package springcloud.zuul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * http://127.0.0.1:8060/user/user/getTime
     */
    @ResponseBody
    @RequestMapping("/getTime")
    public String getTime() {
        try {
            String result = format.format(new Date()) + " zuul\\UserController.getTime()";
            System.out.println(result);
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
