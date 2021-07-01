package sorting;

public class RadixSort {

    public static int getMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++)
            max = array[i] > max ? array[i] : max;
        return max;
    }

    public static void countingSort(int[] array, int max, int pos) {
        int length = array.length;
        int[] resultArray = new int[length + 1];

        int[] countArray = new int[max + 1];
        for (int i = 0; i < length; i++)
            countArray[(array[i] / pos) % 10]++;

        for (int i = 1; i <= max; i++)
            countArray[i] += countArray[i - 1];

        for (int i = length - 1; i >= 0; i--) {
            resultArray[countArray[(array[i] / pos) % 10] - 1] = array[i];
            countArray[(array[i] / pos) % 10]--;
        }

        for (int i = 0; i < length; i++)
            array[i] = resultArray[i];
    }

    public static void sort(int[] array) {
        int max = getMax(array);

        for (int pos = 1; max / pos > 0; pos *= 10)
             countingSort(array, max, pos);
    }
}
