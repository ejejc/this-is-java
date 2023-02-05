package com.example.thisisjava.test_ex;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {

    @Test
    void create() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create");
    }

    @Test
    //@Disabled - 테스트를 진행하지 않고 싶을 경우 사용
    void create1() {
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

    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }
}