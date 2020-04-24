package springcloud.zuul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/myZuul")
public class ZuulController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * http://127.0.0.1:8060/myZuul/getName
     */
    @ResponseBody
    @RequestMapping("/getName")
    public String getName() {
        String result = format.format(new Date()) + " zuul\\ZuulController.getName()";
        System.out.println(result);
        return result;
    }

    /**
     * http://127.0.0.1:8060/myZuul/getTime2
     * http://127.0.0.1:8060/myZuul/user/getTime
     */
    @ResponseBody
    @RequestMapping("/getTime")
    public String getTime() {
        String result = format.format(new Date()) + " zuul\\ZuulController.getTime()";
        System.out.println(result);
        return result;
    }
}
