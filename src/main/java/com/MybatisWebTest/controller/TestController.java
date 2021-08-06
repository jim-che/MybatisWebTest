package com.MybatisWebTest.controller;

import com.MybatisWebTest.service.Department.DepartmentImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    DepartmentImp imp;

    @RequestMapping("/all")
    public String all(){
        return imp.queryAll().toString();
    }
}
