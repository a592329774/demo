package com.demo.userInfo.controller;

import com.demo.userInfo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService ;
    @GetMapping("/hello1")
    @ResponseBody
    public String hello(){
        Map maps = userInfoService.selectAll();
        System.out.print(maps);
        return "11";
    }
    @GetMapping("/login")
    public String login(){
        return "login" ;
    }

    @PostMapping("/getUserInfo")
    @ResponseBody
    public Map<String, Object> getUserInfo(){
        Map<String,Object> userInfo = new HashMap<>() ;
        userInfo.put("name","zhangn") ;
        userInfo.put("age",18) ;
        return  userInfo ;
    }

}
