package com.example.thisisjava.test_ex;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

/**
 * 클래스에 모든 메소드 들에 적용된다. [ _ 로 표기 되어 있는 부분을 ' ' 공백으로 치환한다는 의미]
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("스터디 만들기") // 테스트 이름을 좀 더 쉽고 간결하게 제공하도록 도와주는 어노테이션
    void create_new_study() {
        /**
         * 특정 환경 및 특정 os에서만 테스트가 돌아가도록 하기 위해서 assumeTrue를 사용
         */
        String env = System.getenv("TEST_ENV");
        assumeTrue("LOCAL".equalsIgnoreCase(env));

        // assumingThat
        assumingThat("Local".equalsIgnoreCase(env), () -> {
            // 환경이 local일 경우 실행하는 함수
        });

        assumingThat("Stage".equalsIgnoreCase(env), () -> {
            // 환경이 Stage일 경우 실행하는 함수
        });

        Study study = new Study(10);
        assertAll(
                () -> assertNotNull(study),
                () -> assertEquals(StudyStatus.DRAFT, study.getStatus(), () -> "스터디를 처음 만들면 DRAFT 상태이다."),
                () -> assertTrue(study.getLimit() > 0 , "스터디 최대 인원은 0보다 커야 한다.")
        );

        // assertJ 사용하여 다양하게 표현 가능하다.
        Study actual = new Study(10);
        assertThat(actual.getLimit()).isGreaterThan(0);
    }

    @Test
    //@Disabled - 테스트를 진행하지 않고 싶을 경우 사용
    @EnabledOnOs({OS.MAC, OS.LINUX}) // 특정 os에서만 작동하도록
    @EnabledOnJre({JRE.JAVA_11}) // 특정 자바 버전에서만 작동하도록 설정
    @EnabledIfEnvironmentVariable(named = "TEST_ENV", matches = "local") // 위의 코드로 작성된 것을 간단하게 어노테이션을 사용하여 특정 환경별 작동 여부를 설정할 수 있다.
    /*
        그 외 어노테이션
        @EnabledIf()
        @EnabledIfSystemProperty()
    */
    void create_new_study_again() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Study(-10));
        String msg = e.getMessage();
        assertEquals("limit은 0보다 커야 한다.", e.getMessage());
    }

    @Test
        //@Disabled - 테스트를 진행하지 않고 싶을 경우 사용
    void create_new_study_again_timeout() {
        // 만약 100ms를 초과 하면 해당 테스트가 종료되었으면 할 때 사용
        // 만약 spring threadLocal이라는 코드를 사용할 경우 예외 상황이 발생된다.
        /**
         * spring transactional한 테스트는 rollback을 기본으로 하는데,
         * rollback이 안되고 db에 반영이 될 수 있다.
         * 그 트랜잭션의 설정을 가지고 있는 thread와 별개의 thread로 해당 코드를 실행하기 때문이다.
         */
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            new Study(10);
            Thread.sleep(300);
        });
        // TODO: spring ThreadLocal 공부해보기 > threadlocal은 다른 thread에서 공유가 되지 안된다.
        assertTimeout(Duration.ofMillis(100), () -> {
            new Study(10);
            Thread.sleep(300);
        });
    }

    @Test
    @DisplayName("태깅 테스트") // 테스트 이름을 좀 더 쉽고 간결하게 제공하도록 도와주는 어노테이션
    @Tag("fast")
    void create_new_study_taging() {
        System.out.println("create1");
    }

    @Test
    @DisplayName("태깅 테스트_2") // 테스트 이름을 좀 더 쉽고 간결하게 제공하도록 도와주는 어노테이션
    @Tag("slow")
    void create_new_study_taging_2() {
        System.out.println("create2");
    }
    /**
    /**
     * 모든 테스트 들이 시작하기 전에 딱 한번 실행되는 메서드
     */
    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    /**
     * 각 테스트들이 시작 하기 전 / 종료 한 후 실행되는 메소드
     */
    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }
}