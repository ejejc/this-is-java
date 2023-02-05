package com.example.thisisjava.test_ex;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 클래스에 모든 메소드 들에 적용된다. [ _ 로 표기 되어 있는 부분을 ' ' 공백으로 치환한다는 의미]
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("스터디 만들기") // 테스트 이름을 좀 더 쉽고 간결하게 제공하도록 도와주는 어노테이션
    void create_new_study() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create");
    }

    @Test
    //@Disabled - 테스트를 진행하지 않고 싶을 경우 사용
    void create_new_study_again() {
        System.out.println("create1");
    }

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