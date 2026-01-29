package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping
    public String index(){
        return "hello hello";
    }

    @GetMapping("index2")// from customer
    public String index2(){
        return "hello2";
    }

}
