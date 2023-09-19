import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = { 235, 49, 366, 480, 401, 72, 373, 465, 105, 336, 379, 494, 425, 121, 305, 27};

        System.out.println("Original Array: " + Arrays.toString(array));

        int[] ints = Arrays.stream(array)
                .filter(i -> i % 2 > 0).toArray();

        mergeSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void mergeSort(int[] array) {
        System.out.println("Merge Sort array: " + Arrays.toString(array));
        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        System.out.println("Merge sort Left");
        mergeSort(left);
        System.out.println("Merge sort right");
        mergeSort(right);
        merge(left, right, array);
    }

    public static void merge(int[] left, int[] right, int[] array) {
        System.out.println("Entered merge method");
        System.out.println("Merge  array left: " + Arrays.toString(left));
        System.out.println("Merge  array right: " + Arrays.toString(right));
        System.out.println("Merge  array: " + Arrays.toString(array));
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
        System.out.println("Merged array: " + Arrays.toString(array));
    }
}
