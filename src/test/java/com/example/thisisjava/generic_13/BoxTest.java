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

    @Test
    public void 제네릭_메소드_테스트() {
        Box<Integer> box1 = boxing(100);
        int intValue = box1.getContent();
        Assertions.assertEquals(100, intValue);

        Box<String> box2 = boxing("홍길동");
        String strValue = box2.getContent();
        Assertions.assertEquals("홍길동", strValue);
    }

    /**
     * 선언부 즉, 반환 타입 앞에 <> 기호를 추가하고 타입 파라미터를 정의하면
     * 리턴 타입과 매개변수 타입에서 사용한다.
     */
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.setContent(t);
        return box;
    }

    @Test
    public void 제한된_파라미터_테스트() {
        boolean result1 = compare(10, 20);
        Assertions.assertEquals(false, result1);

        boolean result2 = compare(4.5, 4.5);
        Assertions.assertEquals(true, result2);
    }

    public static <T extends Number> boolean compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return (v1 == v2);
    }

}