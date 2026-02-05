package org.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {

     @GetMapping
      public String index(){
          return "item";
      }
      @GetMapping("2")
      public String index2(){
         return "index 2";
      }
      @GetMapping
      public String index3(){
         return "index 3";
      }

      public String index4(){
         return "index 4";
      }
}
