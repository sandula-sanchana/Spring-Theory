package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloController {

    public HelloController(){
        System.out.println("hello ocontroller");
    }

    @GetMapping("index")
    public String index(){
        return "index";
    }

    @GetMapping
    public String hello(){
        return "hello";
    }
}
