import sorting.BubbleSort;
import sorting.InsertionSort;
import sorting.SelectionSort;

import java.util.Arrays;

public class Main {

    public static void printArray(int[] array) {
        Arrays.stream(array).mapToObj(j -> j + " ").forEach(System.out::print);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
        int[] array2 = {5, 6, 4, 7, 3, 0};

        BubbleSort.sort(array);
        printArray(array);
        //printArray(SelectionSort.sort(array2));
    }

}
