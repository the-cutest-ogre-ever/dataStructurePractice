import sorting.InsertionSort;
import java.util.Arrays;

public class Main {

    public static void printArray(int[] array) {
        Arrays.stream(array).mapToObj(j -> j + " ").forEach(System.out::print);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};

        printArray(InsertionSort.sort(array));
    }

}
