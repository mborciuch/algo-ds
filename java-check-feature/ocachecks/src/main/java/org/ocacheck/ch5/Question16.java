package org.ocacheck.ch5;

import java.util.ArrayList;
import java.util.List;

public class Question16 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.remove(0);

        String first = "First";
        List<String> firstList = new ArrayList<>();
        firstList.add(first);
        List<String> secondList = new ArrayList<>();
        firstList.add(first);
        System.out.println(firstList.equals(secondList));

    }
}
