package com.example.thisisjava.test_ex;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LottoNumberGenerator {

    public List<Integer> generate(final int money) {
        if (!isValidMoney(money)) {
            throw new RuntimeException("올바른 금액이 아닙니다");
        }
        return generate();
    }

    private List<Integer> generate() {
        return new Random()
                .ints(1, 45 + 1)
                .distinct()
                .limit(6)
                .boxed()
                .collect(Collectors.toList());
    }

    private boolean isValidMoney(final int money) {
        return money == 1000;
    }
}
