package com.fastcampus.jpa.bookmanager.controller;

import com.fastcampus.jpa.bookmanager.dto.People;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.lang.model.element.PackageElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class ApiTestController {

    private Map<String, People> parmmap;

    @PostConstruct
    public void init(){
        parmmap = new HashMap<String, People>();
        parmmap.put("1", new People("dsg1", 11, "dsg1@test.com"));
        parmmap.put("2", new People("dsg2", 12, "dsg2@test.com"));
        parmmap.put("3", new People("dsg3", 13, "dsg3@test.com"));
    }

    @GetMapping("/get/all")
    public List<People> getAll(){
        List<People> peopleList = new ArrayList<>(parmmap.values());
        return peopleList;
    }

    @GetMapping("/get/{id}")
    public People getId(@PathVariable("id") String id){
        return parmmap.get(id);
    }

    @PostMapping("post/{id}")
    public void postId(@PathVariable("id") String id, @RequestBody People people) {

        parmmap.put(id , new People(people.getName(), people.getAge(), people.getEmail()));

        System.out.println("post id :" + id);
        System.out.println("post people :" + new People(people.getName(), people.getAge(), people.getEmail()));
    }

    @PutMapping("/put/{id}")
    public void putId(@PathVariable("id") String id, @RequestBody People people) {

        if(parmmap.get(id) != null) {
            parmmap.get(id).setName(people.getName());
            parmmap.get(id).setAge(people.getAge());
            parmmap.get(id).setEmail(people.getEmail());
        }
        System.out.println("put people :" + people);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteId(@PathVariable("id") String id) {
        parmmap.remove(id);
    }

}
