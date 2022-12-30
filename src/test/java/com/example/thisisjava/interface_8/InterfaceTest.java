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

    @Test
    public void 추상메소드_테스트() {
        RemoteControl rc;
        // 인터페이스 객체에 각 구현 객체를 대입하게 되면, 각 구현 객체에 재정의 된 메소드가 호출되게 된다.
        rc = new Television();
        rc.trunOn();
        rc.setVolume(5);
        rc.trunOff();

        rc = new Audio();
        rc.trunOn();
        rc.setVolume(5);
        rc.trunOff();
    }

    @Test
    public void default_메소드_테스트() {
        RemoteControl rc;

        rc = new Television();
        rc.trunOn();
        rc.setVolume(5);

        // 디폴트 메소드 호출
        rc.setMute(true);
        rc.setMute(false);
    }
}