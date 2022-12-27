package com.example.thisisjava.Inheritance_7;

import org.springframework.stereotype.Service;

@Service
public class ExService {
    public void ex1() {
        Driver driver = new Driver();
        Vehicle vehicle = new Vehicle();

        /**
         * 일반적으로 drive() 메소드를 호출하면 vehicle 객체를 제공할 것이다.
         * 그러나, 매개값으로 vehicle 객체만 전달하는 것은 아니다.
         * 자동타입변환으로 인해 vehicle 객체의 자식 객체도 제공할 수 있다.
         */
        driver.drive(vehicle);

        // 위의 정의한 설명을 테스트 해보자 !!
        Driver driver1 = new Driver();
        Bus bus  = new Bus();
        driver1.drive(bus); // 오 .. 자식 객체를 넣어도 된다 !!
    }
}
