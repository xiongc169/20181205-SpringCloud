package springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * https://127.0.0.1:8120/ribbon/get
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/get")
    public String get() {
        String result = restTemplate.getForObject("http://springcloud-provider:8010/user/getTime", String.class);
        System.out.println(result);
        return result;
    }

}
