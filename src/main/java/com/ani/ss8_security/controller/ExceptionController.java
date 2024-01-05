package com.ani.ss8_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionController {
@GetMapping("/403")
    public String page403(){
    return "403";
}
}
