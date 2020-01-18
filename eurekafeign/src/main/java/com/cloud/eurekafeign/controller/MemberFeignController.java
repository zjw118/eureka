package com.cloud.eurekafeign.controller;

import com.cloud.eurekafeign.service.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberFeignController {
    @Autowired
    private OrderFeign orderFeign;
@RequestMapping("/memTest1")
    public String memTest(){
        String str = orderFeign.orderTest();
        return str;
    }

}
