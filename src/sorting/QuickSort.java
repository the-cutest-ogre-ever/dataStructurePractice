package sorting;

import java.util.Arrays;

public class QuickSort {

    private static void swap(int[] array, int leftIndex, int rightIndex) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }

    private static void splitArray(int[] array, int beginIndex, int endIndex) {
        if (beginIndex < endIndex) {
            int pivot = array[endIndex];
            int leftPointer = beginIndex - 1;

            for (int i = beginIndex; i < endIndex; i++) {
                if (array[i] <= pivot) {
                    leftPointer++;
                    swap(array, leftPointer, i);
                }
            }
            swap(array, endIndex, leftPointer + 1);
            splitArray(array, beginIndex, leftPointer);
            splitArray(array, leftPointer + 1, endIndex);
        }
    }

    public static void sort(int[] array) {
        splitArray(array, 0, array.length - 1);
    }
}
