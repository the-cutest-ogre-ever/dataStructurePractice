package sorting;

import java.util.Arrays;

public class ShellSort {

    public static void printArray(int[] array) {
        Arrays.stream(array).mapToObj(j -> j + " ").forEach(System.out::print);
        System.out.println("\n");
    }

    private static void swap(int[] array, int leftIndex, int rightIndex) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }

    public static void sort(int[] array) {
        int length = array.length;
        int temp, j;

        for (int interval = length / 2; interval > 0;) {
            for (int i = interval; i < length; i++) {
                /*
                temp = array[i];
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval)
                    array[j] = array[j - interval];
                array[j] = temp;
                 */
                if (array[i] < array[i - interval])
                {
                    System.out.println("going to swap " + array[i] + " and " + array[i - interval]);
                    swap(array, i, i - interval);
                    System.out.print("step array: ");
                    printArray(array);
                }
                if (interval % 2 == 1)
                    interval = interval / 2 + 1;
                else
                    interval /= 2;
            }
        }
    }
}
