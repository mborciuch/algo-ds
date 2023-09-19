package chapter4;

import java.util.Arrays;

public class SumAlgorithm {

    public int sum(int[] array) {
        if(array.length == 0){
            return 0;
        }
        if(array.length == 1){
            return array[0];
        }

        int pivot = (array.length / 2);

        int[] leftArray = Arrays.copyOf(array, pivot);
        int[] rightArray = Arrays.copyOfRange(array, pivot, array.length);

        return sum(leftArray) + sum(rightArray);

    }

}
