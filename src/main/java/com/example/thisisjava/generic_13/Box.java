package com.example.thisisjava.generic_13;

public class Box<T> {
    public T content;

    public boolean compare(Box<T> other) {
        return content.equals(other.content);
    }
}
