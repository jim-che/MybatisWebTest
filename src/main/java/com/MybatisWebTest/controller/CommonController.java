package com.MybatisWebTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {

    @GetMapping("/backIndex")
    public String BackToIndex(){
        return "forward:/main.html";
    }
}
