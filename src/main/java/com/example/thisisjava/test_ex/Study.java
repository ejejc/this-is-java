package com.example.thisisjava.test_ex;

public class Study {
    private StudyStatus status= StudyStatus.DRAFT;
    private int limit;

    public Study(int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("limit은 0보다 커야 한다.");
        }
        this.limit = limit;
    }

    public StudyStatus getStatus() {
        return this.status;
    }

    public int getLimit() {
        return limit;
    }
}
