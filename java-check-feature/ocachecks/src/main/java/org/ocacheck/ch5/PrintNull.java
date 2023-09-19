package org.ocacheck.ch5;

public class PrintNull {
    public static void main(String[] args) {
        Object object = null;
        String someString = "Hello, World";
        System.out.println(object);
        System.out.println(someString + object);
    }
}
