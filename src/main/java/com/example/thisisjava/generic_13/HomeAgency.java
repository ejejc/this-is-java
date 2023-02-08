package com.example.thisisjava.generic_13;

public class HomeAgency implements Rentable<Home>{

    @Override
    public Home rent() {
        return new Home();
    }
}
