package com.example.thisisjava.Inheritance_7;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VehicleTest {

    @Autowired
    private ExService exService;

    @Test
    public void 테스트() {
        exService.ex1();
    }
}