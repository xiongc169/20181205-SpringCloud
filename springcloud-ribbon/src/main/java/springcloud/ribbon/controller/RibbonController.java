package springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/ribbon")
public class RibbonController {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    @Autowired
    private RestTemplate restTemplate;

    /**
     * http://127.0.0.1:8120/ribbon/get
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/get")
    public String get() {
        String invokeResult = restTemplate.getForObject("http://springcloud-provider:8010/user/getTime", String.class);
        String result = sdFormat.format(new Date()) + " ribbon\\RibbonController.get(): " + invokeResult;
        System.out.println(result);
        return result;
    }

}
