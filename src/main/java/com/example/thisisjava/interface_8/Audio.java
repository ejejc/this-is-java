package com.example.thisisjava.interface_8;

public class Audio implements RemoteControl{

    private int volumn;

    @Override
    public void trunOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void trunOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volumn > RemoteControl.MAX_VOLUMN) {
            this.volumn = RemoteControl.MAX_VOLUMN;
        } else if (volumn < RemoteControl.MIN_VOLUMN) {
            this.volumn = RemoteControl.MIN_VOLUMN;
        } else {
            this.volumn = volumn;
        }

        System.out.println("현재 Audio 볼륨: " + volumn);
    }
}
