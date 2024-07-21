package com.example.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/admin")
    public String admin() {
        return "classRoom/admin";
    }

    @GetMapping("/manager")
    public String user() {
        return "classRoom/manager";
    }
}
