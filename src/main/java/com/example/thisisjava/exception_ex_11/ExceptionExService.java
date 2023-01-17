package com.example.thisisjava.exception_ex_11;

import org.springframework.stereotype.Service;

@Service
public class ExceptionExService {
    public  void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수:" + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());// TODO: 왜 null로 나오는지
            System.out.println("=====");
            System.out.println(e.toString());
            System.out.println("=====");
            e.printStackTrace();
        } finally {
            System.out.println("마무리 실행");
        }
    }
}
