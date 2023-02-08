package com.example.thisisjava.generic_13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoxTest {

    @Test
    public void 제네릭_기본_테스트() {
        Box<String> box1 = new Box<>(); // new Box<> 에 타입을 명시하지 않으면 선언 시 타입을 사용한다는 의미
        box1.content = "안녕하세요";
        String str = box1.content;
        Assertions.assertEquals(box1.content, str);

        Box<Integer> box2 = new Box<>();
        box2.content = 100;
        int value = box2.content;
        Assertions.assertEquals(box2.content, value);
    }

    @Test
    public void 제네릭_타입_클래스_테스트() {
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("스마트Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel(tvModel);

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }

    @Test
    public void 제네릭_타입_인터페이스_테스트() {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();
    }

    @Test
    public void 제네릭_타입_파라미터_비교_테스트() {
        Box box1 = new Box();   // Object 형
        box1.content = "100";   // String 형

        Box box2 = new Box();
        box2.content = "100";

        Box box3 = new Box();
        box3.content = 100;

        Assertions.assertEquals(true, box1.compare(box2));
        Assertions.assertEquals(false, box1.compare(box3));
    }

}