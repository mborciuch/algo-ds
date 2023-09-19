package chapter4;

import java.util.Arrays;

public class FindMaxAlgorithm {

    int getMax(int[] array) {
        if(array.length == 2){
            return array[0] > array[1] ? array[0] : array[1];
        }
        int[] ints = Arrays.copyOfRange(array, 1, array.length);
        int subMax = getMax(ints);
        return  array[0] > subMax ? array[0] : subMax;
    }
}
