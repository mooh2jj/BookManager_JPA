package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;


class UserTest {
    @Test
    void test(){
        User user = new User();
        user.setEmail("mooh2j@naver.com");
        user.setName("dsg");

        User user1 = User.builder()
                .name("sss")
                .email("dddd")
                .build();

        System.out.println(">>> "+ user1);

    }

}