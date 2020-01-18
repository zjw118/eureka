package eurekaclient.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @RequestMapping("orderTest")
    public String OrderTest(){
        return "恭喜来到您的订单页面";
    }
}
