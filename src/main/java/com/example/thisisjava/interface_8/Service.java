package com.example.thisisjava.interface_8;

public interface Service {

    // 디폴트 메소드 선언
    default void defaultMethod1() {
        System.out.println("defaultMethod1 종속 코드");
        this.defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("defaultMethod2 종속 코드");
        this.defaultCommon();
    }

    // private 메소드
    private void defaultCommon() {
        System.out.println("중복 코드1");
        System.out.println("중복 코드2");
    }

    // 정적 메소드
    static void staticMethod1() {
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    // private 정적 메소드
    private static void staticCommon() {
        System.out.println("static 중복 코드1");
        System.out.println("static 중복 코드2");
    }
}
