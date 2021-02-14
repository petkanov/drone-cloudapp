package com.odafa.cloudapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {
    
    @GetMapping("/")
    public String indexPage() {
        return "index";
    }
}
