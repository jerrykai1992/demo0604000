package com.cykj.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("hello")
public class HelloController {

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello world";
    }

    //pull测试方法0604
    public String pull(){
    return "pull success";
    }
      
    
}
