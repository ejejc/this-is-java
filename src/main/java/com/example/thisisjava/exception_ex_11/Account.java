package com.example.thisisjava.exception_ex_11;

public class Account {

    private long balance;

    public Account() {}

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws InSufficientException {
        if (balance < money ) {
            throw new InSufficientException("잔고부족: " + (money-balance) + " 모자람");
        }
        balance -= money;
    }
}
