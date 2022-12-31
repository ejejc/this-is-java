package com.example.thisisjava.interface_8;

public class SmartTelevision implements RemoteControl, Searchable{
    @Override
    public void trunOn() {
        System.out.println("스마트 TV를 켭니다.");
    }

    @Override
    public void trunOff() {
        System.out.println("스마트 TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("현재 볼륨: " + volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
