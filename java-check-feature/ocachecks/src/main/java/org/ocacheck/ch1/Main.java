package org.ocacheck.ch1;

public class Main {
    public static void main(String[] x) {
        Main mainReference = new Main();
        Main.printMe();
    }

    static void printMe() {
        System.out.println("Hello, world from main");
    }
}
