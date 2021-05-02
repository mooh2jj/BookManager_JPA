package com.fastcampus.jpa.bookmanager.controller;

import com.fastcampus.jpa.bookmanager.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

/*    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData){
        requestData.entrySet().forEach(stringObjectEntry -> {
            System.out.println("key :" + stringObjectEntry.getKey());
            System.out.println("value :" + stringObjectEntry.getValue());
        });
    }*/

    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto postRequestDto){
        System.out.println("postRequestDto :" + postRequestDto );
    }
}
