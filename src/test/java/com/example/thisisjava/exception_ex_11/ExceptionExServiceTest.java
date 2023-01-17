package com.example.thisisjava.exception_ex_11;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ExceptionExServiceTest {

    @Autowired
    private ExceptionExService exService;

    @Test
    public void 실행_예외_테스트() {
        exService.printLength(null);
    }
}