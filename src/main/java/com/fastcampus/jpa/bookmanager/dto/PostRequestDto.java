package com.fastcampus.jpa.bookmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PostRequestDto {

    private String account;
    private String email;
    private String address;
    private String password;

    @JsonProperty("phone_number")   // 전송하는 게 스네이크케이스라면
    private String phoneNumber;


}
