package com.example.thisisjava.interface_8;

public class Audio implements RemoteControl{
    @Override
    public void trunOn() {
        System.out.println("Audio를 켭니다.");
    }
}
