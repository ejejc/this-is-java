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

        // 정적 메소드 호출
        RemoteControl.changeBattery();
    }

    @Test
    public void private_메소드_static_private_메소드_테스트() {
        Service service = new ServiceImpl();

        service.defaultMethod1();
        service.defaultMethod2();

        Service.staticMethod1();
        Service.staticMethod2();
    }

    @Test
    public void 다중_인터페이스_테스트() {
        RemoteControl rc = new SmartTelevision();
        rc.trunOn();
        rc.trunOff();
        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.naver.com");
    }

    @Test
    public void 인터페이스_상속_테스트() {
        InterfaceImplC interfaceImplC = new InterfaceImplC();

        InterfaceA interfaceA = interfaceImplC;
        interfaceA.methodA();
        // methodB or methodC 호출 불가

        InterfaceB interfaceB = interfaceImplC;
        interfaceB.methodB();
        // methodA or methodC 호출 불가

        // 인터페이스A,B를 상속받은 자식 인터페이스C는 모두 호출 가능
        InterfaceC interfaceC = interfaceImplC;
        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();
    }
}