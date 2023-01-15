package com.example.thisisjava.nested_class_9;

import com.example.thisisjava.interface_8.Bus;
import com.example.thisisjava.interface_8.Driver;
import com.example.thisisjava.interface_8.Taxi;
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

    @Test
    public void  중첩_인터페이스_테스트() {
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        }

        // Ok 버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new OkListener());
        btnOk.click();

        // Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        // Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }

        btnCancel.setClickListener(new CancelListener());
        btnCancel.click();
    }

    @Test
    public void 익명_자식_객체_테스트() {
        // Car 객체 생성
        Car car = new Car();

        // 익명 자식 객체가 대입된 필드 사용
        car.run1();

        // 익명 자식 객체가 대입된 로컬변수 사용
        car.run2();

        // 익명 자식 객체가 대입된 매개변수 사용
        car.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
            }
        });
    }
}