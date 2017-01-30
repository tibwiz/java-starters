package com.abh.java.generics;

public class GenericTest {

    public static void main(String[] args) {
        Box<Integer> b = new Box<>();
        b.set(Integer.valueOf(10));
        System.out.println(b.get());
        Box b1 = new Box();
        b1.set("test");
        b = b1;
        System.out.println(b.get());
        Number n;
    }
}
