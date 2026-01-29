package org.example.controller;


import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/Request")
@RestController
public class RequestController {
    @PostMapping
    public String post(@RequestHeader("Authorization") String authorization,//header
                       @RequestHeader("Token") String token){

        return authorization + " " +token;

    }

    @PostMapping("querystring")
    public String getQueryStringPara(@RequestParam ("name")String name){// params

        return "hello para" + name;

    }

    @PostMapping("path_variable/{name}/{addr}")
    public String getPathVariables(@PathVariable("name") String name,@PathVariable("addr") String address){ // url //pathvariable/sandula

        return name + "  " + address;
    }

    @PostMapping("body/form")
    public String getRequestBody(@RequestParam("id") String id,@RequestParam("name") String name) {
        return id + " " + name;
    }

    @PostMapping("body/form")
    public String getRequestBodyXWWWFormURLEncoded(@RequestParam("id") String id,@RequestParam("name") String name) {
        return id + " " + name;
    }
}
