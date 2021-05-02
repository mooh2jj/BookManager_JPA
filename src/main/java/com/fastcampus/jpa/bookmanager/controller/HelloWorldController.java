package com.fastcampus.jpa.bookmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello-world";
    }

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String Pathname){
        System.out.println("PathVariable : "+Pathname);
        return Pathname;
    }

    // 쿼리 파라미터 ?로 시작하는 &key=value 형식임 아! Map형식으로 받을 수도 있겠구나!
    
}
