package com.example.demo.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainControllerTest {

    @Autowired
    private MainController mainController;

    @Test
    void aaa() {
        Assertions.assertEquals("bbb", mainController.aaa());
    }
}