package org.javainterviewquestion;

import java.util.Arrays;

public class SummingIntsInArray5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3 ,4, 5 , 6};
        int sum = summingWithLoop(array);
        System.out.println(sum);
        sum = summingWithStream(array);
        System.out.println(sum);
    }

    private static int summingWithLoop(int[] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    private static int summingWithStream(int[] array) {
        return Arrays.stream(array)
                .sum();
    }


}
