package com.example.thisisjava.java_base_module_12;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Member member = (Member) obj;
        return this.id.equals(member.id);
    }
}
