package com.cloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class MemberRibbonController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/memTest2")
    public String menTest(){
        String str = restTemplate.getForObject("http://member-server/memTestRibbon",String.class);
        return str;
    }

}
