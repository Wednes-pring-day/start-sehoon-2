package com.sehoon.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setEmail("test@test.com");
        user.setName("sehoon");
        user.setCreateAt(LocalDateTime.now());
        user.setUpdateAt(LocalDateTime.now());

        User user1 = new User("sehoon", "test@test.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("sehoon", "test@test.com");

        User user3 = user.builder()
                .name("sehoon")
                .email("test@test.com")
                .build();

        System.out.println(">>> " + user.toString());
    }

}