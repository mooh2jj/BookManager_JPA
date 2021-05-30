package com.fastcampus.jpa.bookmanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class People {

    private String name;
    private int age;
    private String email;
}
