package org.example.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("api/v1/request")
@RestController
public class RequestController {

    // ✅ HEADERS
    @PostMapping("/headers")
    public String headers(
            @RequestHeader("Authorization") String authorization,
            @RequestHeader("Token") String token){

        return authorization + " " + token;
    }

    // ✅ QUERY PARAM
    // POST /api/v1/request/query?name=sandula
    @PostMapping("/query")
    public String query(@RequestParam String name){
        System.out.println(name);
        return "Hello " + name;
    }

    // ✅ PATH VARIABLE
    // POST /api/v1/request/path/sandula/colombo
    @PostMapping("/path/{name}/{addr}")
    public String path(
            @PathVariable String name,
            @PathVariable("addr") String address){

        return name + " " + address;
    }

    // ✅ x-www-form-urlencoded
    @PostMapping("body/form-url-encoded")
    public String getRequestBodyXWWWFormUrlEncoded(@RequestParam("id") String id,
                                                   @RequestParam("name")  String name){
        return "Hello World! 9 " + id + " : " + name;
    }


    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String upload(
                         @RequestParam("name") String name) {
        System.out.println(name);
        return " yaaaaa " + name;
    }


    @PostMapping("body/json")
    public String getRequestBodyJson(@RequestBody java.util.Map<String, String> body){

        String name = body.get("name");

        return "Hello " + name;
    }

}
