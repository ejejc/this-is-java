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

    @Test
    public void 인터페이스_상수_테스트() {
        System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUMN);
        System.out.println("리모콘 최저 볼륨: " + RemoteControl.MIN_VOLUMN);
    }
}