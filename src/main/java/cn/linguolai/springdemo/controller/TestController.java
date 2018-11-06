package cn.linguolai.springdemo.controller;


import cn.linguolai.springdemo.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {


    @Resource
    private User user;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test() {
        return user.toString();
    }
}
