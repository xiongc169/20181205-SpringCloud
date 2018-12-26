package springcloud.zuul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/zuul")
public class ZuulController {

    @ResponseBody
    @RequestMapping("/getName")
    public String getName() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = format.format(new Date());
        System.out.println("Name: " + now);
        return now;
    }

    @ResponseBody
    @RequestMapping("/getTime")
    public String getTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = format.format(new Date());
        System.out.println(now);
        return now;
    }
}