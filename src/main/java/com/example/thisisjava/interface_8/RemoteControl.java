package com.example.thisisjava.interface_8;

public interface RemoteControl {
    /**
     * 상수는 구현 객체와 관련 없는 인터페이스 소속 멤버 이므로,
     * 인터페이스로 바로 접근하여 상수값을 읽을 수 있다.
     */
    int MAX_VOLUMN = 10;
    int MIN_VOLUMN = 0;

    // 추상 메소드 선언
    void trunOn();
    void trunOff();
    void setVolume(int volume);

    // 디폴트 인스턴스 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
            // 추상 메소드 호출하면서 상수 필드 사용
            this.setVolume(MIN_VOLUMN);
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    static void changeBattery() {
        System.out.println("리모콘 건전지를 교환합니다.");
    }
}
