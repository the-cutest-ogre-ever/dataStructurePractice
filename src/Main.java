import sorting.BubbleSort;
import sorting.InsertionSort;

public class Main {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};

        printArray(InsertionSort.sort(array));
    }

}
