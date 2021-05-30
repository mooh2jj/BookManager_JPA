package com.fastcampus.jpa.bookmanager.controller;

import com.fastcampus.jpa.bookmanager.dto.People;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApiTestControllerTest {

    private Map<String, People> parmmap;

    @PostConstruct
    public void init(){
        parmmap = new HashMap<String, People>();
        parmmap.put("1", new People("dsg1", 11, "dsg1@test.com"));
        parmmap.put("2", new People("dsg2", 12, "dsg2@test.com"));
        parmmap.put("3", new People("dsg3", 13, "dsg3@test.com"));
    }

    @Test
    @GetMapping("/get/{id}")
    public People getId(@PathVariable("id") String id){
        return parmmap.get(id);
    }
}