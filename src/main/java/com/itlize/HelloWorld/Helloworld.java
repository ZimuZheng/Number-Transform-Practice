package com.itlize.HelloWorld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Helloworld {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!!!!!!!!";
    }
}
