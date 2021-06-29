import sorting.*;

import java.util.Arrays;

public class Main {

    public static void printArray(int[] array) {
        Arrays.stream(array).mapToObj(j -> j + " ").forEach(System.out::print);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
        int[] array2 = {5, 6, 4, 7, 3, 0};
        int[] array3 = {3, 5, 11, 17, -2, -8, 0};
        int[] sourceArray = new int[]{52, 9, 67, 1, 15, 122, 32, 17, 0, 98};

        /*
        printArray(array);
        CountingSort.sort(array);
        printArray(array);

        System.out.println("\n");

        printArray(sourceArray);
        CountingSort.sort(sourceArray);
        printArray(sourceArray);
        */

        printArray(array3);
        BucketSort.sort(array3);
        printArray(array3);

    }

}
