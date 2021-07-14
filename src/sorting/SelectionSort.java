package sorting;

public class SelectionSort {

    public static void sort(int[] array) {
        int length = array.length;
        int minInd;

        for (int i = 0; i < length - 1; i++) {
            minInd = SortingUtils.getMinInd(array, i, length);
            int temp = array[i];
            array[i] = array[minInd];
            array[minInd] = temp;
        }
    }
}
