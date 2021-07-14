package sorting;

public class SortingUtils {

    public static void swap(int[] array, int leftIndex, int rightIndex) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }

    public static int getMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++)
            max = array[i] > max ? array[i] : max;
        return max;
    }

    public static int getMaxDecimal(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++)
            max = array[i] > max ? array[i] : max;
        while (max % 10 != 0)
            max++;
        return max;
    }

    public static int getMinDecimal(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++)
            min = array[i] < min ? array[i] : min;
        while (min % 10 != 0)
            min--;
        return min;
    }

    public static int getMinInd(int[] array, int unsortedInd, int length) {
        int minInd = unsortedInd;

        for (int i = unsortedInd + 1; i < length; i++)
            minInd = array[i] < array[minInd] ? i : minInd;
        return minInd;
    }

}
