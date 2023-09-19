package org.ocacheck.ch5;

public class Question5 {

    public static void main(String[] args) {
        String s1 = "Hello";
        StringBuilder s3 = new StringBuilder("Hello");
        if (s1.equals(s3)){
            System.out.println("s1.equals(s3)");
        }
    }

}
