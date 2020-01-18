package com.cloud.member.eurekamemberclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
//    @Autowired
//    private RestTemplate restTemplate;
    @RequestMapping("/memTestRibbon")
    public String menTest1(){
        String str = "这是ribbon的跳转地址";
        return str;
    }

    @RequestMapping("/orderTest")
    public String menTest(){
        String str = "这是feign的跳转地址";
        return str;
    }
}
