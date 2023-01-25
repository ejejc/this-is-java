package com.example.thisisjava.exception_ex_11;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ExceptionExServiceTest {

    @Autowired
    private ExceptionExService exService;

    @Test
    public void 실행_예외_테스트() {
        exService.printLength(null);
    }

    @Test
    public void 리소스_예외_테스트() {
        try (MyResource res = new MyResource("A")) {
            String data = res.read1();
            int value = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }

        System.out.println();

        try (MyResource res = new MyResource("A")) {
            String data = res.read2();
            // NumberFormatException 발생
            int value = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }

        System.out.println();

        MyResource res1 = new MyResource("A");
        MyResource res2 = new MyResource("B");
        try (res1; res2) {
            String data1 = res1.read1();
            String data2 = res2.read2();
        } catch (Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
    }
}