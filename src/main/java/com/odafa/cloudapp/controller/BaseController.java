package com.odafa.cloudapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BaseController {
    
    @GetMapping("/")
    public String indexPage() {
        
        log.debug("Index Page Opened");
        return "index";
    }
}
