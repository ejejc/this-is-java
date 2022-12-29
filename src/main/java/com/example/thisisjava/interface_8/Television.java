package com.example.thisisjava.interface_8;

public class Television implements RemoteControl{
    @Override
    public void trunOn() {
        System.out.println("TV를 켭니다.");
    }
}
