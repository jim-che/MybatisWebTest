package com.MybatisWebTest.controller;

import com.MybatisWebTest.pojo.Admin;
import com.MybatisWebTest.service.Admin.AdminImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    AdminImp employeeService;

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session){
        Admin admin = employeeService.queryByUsername(username);
        System.out.println(admin);
        if(admin ==null||!admin.getPassword().equals(password)){
            model.addAttribute("msg", "账号或密码错误");
            return "login";
        }else {
            session.setAttribute("logUser", username);
            System.out.println(session.getAttribute("logUser"));
            return "redirect:/main.html";
        }
    };


}
