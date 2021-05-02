package com.fastcampus.jpa.bookmanager.controller;

import com.fastcampus.jpa.bookmanager.dto.CarDto;
import com.fastcampus.jpa.bookmanager.dto.PostRequestDto;
import com.fastcampus.jpa.bookmanager.dto.PutRequestDto;
import com.fastcampus.jpa.bookmanager.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

/*    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData){
        requestData.entrySet().forEach(stringObjectEntry -> {
            System.out.println("key :" + stringObjectEntry.getKey());
            System.out.println("value :" + stringObjectEntry.getValue());
        });
    }*/

    //Text
    @GetMapping("/echo")
    public String echo(@RequestParam String account){

        return account;
    }

    //Json
    // req -> object mapper -> object -> method -> object -> object mapper -> json -> response
    @PostMapping("/json")
    public UserDto json(@RequestBody UserDto user){
        return user;
    }

    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto postRequestDto){
        System.out.println("postRequestDto :" + postRequestDto );
    }

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId){
        System.out.println("userId :" + userId );
    }
    // delete -> 리소스 이미 없어도 삭제 ok 뜸!

    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto, @PathVariable(name="userId") Long id){

        System.out.println(id);
        System.out.println(putRequestDto);

        return putRequestDto;
    }

    @PutMapping("/put")
    public ResponseEntity<PutRequestDto> put(@RequestBody PutRequestDto putRequestDto){

        return ResponseEntity.status(HttpStatus.CREATED).body(putRequestDto);
    }



}
