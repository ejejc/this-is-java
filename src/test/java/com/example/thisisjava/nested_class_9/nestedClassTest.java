package com.example.thisisjava.nested_class_9;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class nestedClassTest {

    @Test
    public void 인스턴스_멤버_클래스_테스트() {
        // A 객체 생성
        A a = new A();
        // A 인스턴스 메소드 호출
        a.useB();
    }

    @Test
    public void 바깥_클래스의_객체_접근_테스트() {
        Extract extract = new Extract();
        extract.useB();
    }

    @Test
    public void 매개변수_다형성_테스트() {
        // Driver 객체 생성
        Driver driver = new Driver();

        // Vehicle의 구현 객체 생성
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.driver(bus);
        driver.driver(taxi);
    }
}