package org.ocacheck.ch5;

import java.util.Arrays;

public class Question14 {
    public static void main(String[] args) {
        int[][] ints = new int[1][1];
        ints[0][0] = 5;
        System.out.println(Arrays.toString(ints));
        Object [][][] objects = new Object[3][0][5];
    }
}
