package sorting;

public class SelectionSort {

    public static int getMinInd(int[] array, int unsortedInd, int length) {
        int minInd = unsortedInd;

        for (int i = unsortedInd + 1; i < length; i++)
            minInd = array[i] < array[minInd] ? i : minInd;
        return minInd;
    }

    public static void sort(int[] array) {
        int length = array.length;
        int minInd;

        for (int i = 0; i < length - 1; i++) {
            minInd = getMinInd(array, i, length);
            int temp = array[i];
            array[i] = array[minInd];
            array[minInd] = temp;
        }
    }
}
