package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    void userRepository() {
        userRepository.findAllByLoginNot("admin");
    }

}
