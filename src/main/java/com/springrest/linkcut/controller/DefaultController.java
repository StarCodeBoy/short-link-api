package com.springrest.linkcut.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

    @RequestMapping("/link")
    public String home(){
        return "home.html";
    }
}
