package com.example.thisisjava.Inheritance_7;

/**
 * 전화기의 공통 필드 메소드만 뽑아내어 추상 클래스로 선언
 */
public abstract class Phone {
    // 필드 선언
    String owner;

    // 생성자 선언
    public Phone(String owner) {
        this.owner = owner;
    }

    // 메소드 선언
    void trunOn() {
        System.out.println("폰 전원을 켭니다.");
    }

    void trunOff() {
        System.out.println("폰 전원을 끕니다. ");
    }
}
