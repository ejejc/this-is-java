package com.example.thisisjava.nested_class_9;

public class Home {

    // 필드에 익명 구현 객체 대입
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    // 메소드(필드 사용)
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    // 메소드(로컬 변수 사용)
    public void use2() {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨을 끕니다.");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    // 메소드 (매개변수 이용)
    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
