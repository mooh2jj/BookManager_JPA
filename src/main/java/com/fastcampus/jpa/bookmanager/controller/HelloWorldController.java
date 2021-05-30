package com.fastcampus.jpa.bookmanager.controller;

import com.fastcampus.jpa.bookmanager.dto.People;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
// @Controller + @ResponseBody
@RequestMapping("/ex")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello-world";
    }

    @PostMapping("/people")
    public ResponseEntity<Map<String, Object>> people(@RequestBody People people) {
//        @RequestParam String age,
//          @RequestBody 를 넣어야 한다 post 방식일땐 DTO
        Map<String, Object> parammap = new HashMap<>();
        parammap.put("people",people);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(parammap);
    }

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String Pathname){
        System.out.println("PathVariable : "+Pathname);
        return Pathname;
    }

    // 쿼리 파라미터 ?로 시작하는 &key=value 형식임 아! Map형식으로 받을 수도 있겠구나!
    
}
