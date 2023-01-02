package com.example.thisisjava.nested_class_9;

public class A {
    class B {
        int field1 = 1;

        public B() {
            System.out.println("B 생성자 실행");
        }

        void method1() {
            System.out.println("B-method1 실행");
        }
    }

    void useB() {
        B b = new B();
        System.out.println(b.field1);
        b.method1();
    }
}
