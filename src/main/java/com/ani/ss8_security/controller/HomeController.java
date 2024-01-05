package com.ani.ss8_security.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping("/")
    public String home(){
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
        return "home";
    }
    @GetMapping("/test")
    public String sad(){
        return "test";
    }
}
