package com.example.thisisjava.nested_class_9;

public class Extract {
    // 인스턴스 필드
    String field = "A-field";

    // 인스턴스 메소드
    void method() {
        System.out.println("A-method");
    }

    class B {
        // B의 인스턴스 필드
        String field = "B-field";

        // B의 인스턴스 메소드
        void method() {
            System.out.println("B-method");
        }

        // B의 인스턴스 메소드
        void print() {
            // B 객체의 필드와 메소드 사용
            System.out.println(this.field);
            this.method();

            // Extract 객체의 필드와 메소드 사용
            System.out.println(Extract.this.field);
            Extract.this.method();
        }
    }
    // 인스턴스 메소드
    void useB() {
        B b = new B();
        b.print();
    }
}
