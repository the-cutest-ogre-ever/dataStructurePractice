package sorting;

public class CountingSort {

    public static int getMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++)
            max = array[i] > max ? array[i] : max;
        return max;
    }

    public static void sort(int[] array) {
        int length = array.length;
        int max = getMax(array);
        int[] resultArray = new int[length + 1];

        int[] countArray = new int[max + 1];
        for (int i = 0; i < length; i++)
            countArray[array[i]]++;

        for (int i = 1; i <= max; i++)
            countArray[i] += countArray[i - 1];

        for (int i = length - 1; i >= 0; i--) {
            resultArray[countArray[array[i]] - 1] = array[i];
            countArray[array[i]]--;
        }

        for (int i = 0; i < length; i++)
            array[i] = resultArray[i];
    }
}
