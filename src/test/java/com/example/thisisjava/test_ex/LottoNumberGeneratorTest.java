package com.example.thisisjava.test_ex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.Assertions.*;

import java.util.List;


@SpringBootTest
class LottoNumberGeneratorTest {

    @Test
    @DisplayName("로또 번호 갯수 테스트")
    void lottoNumberSizeTest() {
        // given
        /**
         * 우선 로또를 생성받기 위해서는 로또 생성기 객체와 금액이 필요하다.
         * 그렇기에 given 단계에서는 LottoNumberGenerator 객체와 금액을 적어주면 된다.
         */
        final LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        final int price = 1000;
        // when
        /**
         * 준비가 끝났으면 주어진 금액을 지불하여 로또를 받아야 한다.
         * 이에 대한 when 단계의 코드를 작성하면 다음과 같다.
         */
        final List<Integer> lottoNumber = lottoNumberGenerator.generate(price);

        // then
        /**
         * 이제 최종적으로 우리가 받은 로또가 6개의 숫자를 갖는지 검증해야 한다.
         */
        Assertions.assertEquals(lottoNumber.size(), 6);
    }

    @Test
    @DisplayName("로또 번호 범위 테스트")
    void lottoNumberRangeTest() {
        // given
        final LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        final int price = 1000;
        // when
        final List<Integer> lotto = lottoNumberGenerator.generate(price);
        // then
        assertThat(lotto.stream().allMatch(v->v>=1&& v<=45)).isTrue();
    }

    @Test
    @DisplayName("잘못된 로또 금액 테스트")
    void lottoNumberInvalidMoneyTest() {
        // given
        final LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        final int price = 2000;
        // when
        final RuntimeException e = Assertions.assertThrows(RuntimeException.class, () -> lottoNumberGenerator.generate(price));
        // then
        Assertions.assertEquals(e.getMessage(), "올바른 금액이 아닙니다");
    }
}