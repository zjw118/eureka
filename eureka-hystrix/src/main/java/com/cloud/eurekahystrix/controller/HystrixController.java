package com.cloud.eurekahystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @HystrixCommand(fallbackMethod = "testError")
    @RequestMapping("/memTest")
    public String memTest(){
        String str ="";// restTemplate.getForObject("http://order-server/orderTest",String.class);
        return str;
    }




}
