package com.example.thisisjava.interface_8;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InterfaceTest {

    @Test
    public void 변수선언_구현객체_테스트() {
        RemoteControl rc;
        rc = new Television();
        rc.trunOn();

        rc = new Audio();
        rc.trunOn();
    }
}