package org.javainterviewquestion;

public class IsAssignableFrom28 {

    public static void main(String[] args) {
        String testString = "Hello, World";
        Integer testInt = 15;
        System.out.println(String.class.isAssignableFrom(testString.getClass()));
        System.out.println(String.class.isAssignableFrom(testInt.getClass()));
    }
}
