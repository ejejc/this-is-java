package com.example.thisisjava.Inheritance_7;

public class Student extends Person{

    public int studentNo;

    public Student(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

    public void study() {
        System.out.println("공부를 합니다.");
    }

}
