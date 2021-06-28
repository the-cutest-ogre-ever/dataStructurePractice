package sorting;

public class InsertionSort {

    public static void sort(int[] array) {
        int length = array.length;

        for (int i = 1; i < length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp <= array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
