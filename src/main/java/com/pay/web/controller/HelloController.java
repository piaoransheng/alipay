package com.pay.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//4.创建控制层
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping("/toIndex")
    public String toIndex(){
        return "/pages/index.html";
    }

    @RequestMapping("/toIndex2")
    public ModelAndView toIndex2(){
        return new ModelAndView("/pages/index.html");
    }
}
