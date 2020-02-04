package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
    @RequestMapping("/quick")
    @ResponseBody
    public String con(){
        return "hello word";
    }
}
