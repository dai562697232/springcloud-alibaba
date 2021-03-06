package cn.young1996.springcloudalibaba.serviceconsumer_8080.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @auther Young
 * @date
 * @description
 */

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return restTemplate.getForObject("http://service-provider/echo/" + str, String.class);
    }

    @RequestMapping("/get/{str}")
    public String get(@PathVariable String str){
        return "you got “"+str+"”";
    }
}
