package com.example.thisisjava.Inheritance_7;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InheritanceTest {

    @Autowired
    private ExService exService;

    @Test
    public void 매개변수_다형성_테스트() {
        exService.ex1();
    }

    @Test
    public void instanceOf_테스트() {
        Person p1 = new Person("홍길동");
        exService.instanceofExample(p1);

        Person p2 = new Student("김길동", 10);
        exService.instanceofExample(p2);
    }

    @Test
    public void 추상클래스_테스트() {
        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.trunOn();
        smartPhone.internetSearch();
        smartPhone.trunOff();
    }
}