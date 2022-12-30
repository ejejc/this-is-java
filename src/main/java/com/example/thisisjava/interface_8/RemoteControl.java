package com.example.thisisjava.interface_8;

public interface RemoteControl {
    /**
     * 상수는 구현 객체와 관련 없는 인터페이스 소속 멤버 이므로,
     * 인터페이스로 바로 접근하여 상수값을 읽을 수 있다.
     */
    int MAX_VOLUMN = 10;
    int MIN_VOLUMN = 0;

    public void trunOn();
}
