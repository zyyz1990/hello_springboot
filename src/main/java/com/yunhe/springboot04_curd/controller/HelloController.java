package com.yunhe.springboot04_curd.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World" ;
    }


//    @RequestMapping("/success")
//    public String success(){
//        //默认的页面位置: classpath:/templates/success.html
//        return "success" ;
//    }


//    //查出一些数据,在页面展示
//    @RequestMapping("/success")
//    public String success(Map<String,Object> map){
//        //默认的页面位置: classpath:/templates/success.html
//        map.put("hello","你好") ;
//        return "success" ;
//    }


    //查出一些数据,在页面展示
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        //默认的页面位置: classpath:/templates/success.html
        map.put("hello","<h1>你好</h1>") ;
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu")) ;
        return "success" ;
    }
}
