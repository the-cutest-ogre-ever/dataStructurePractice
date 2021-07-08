package sorting;

public class ShellSort {

    public static void sort(int[] array) {
        int length = array.length;
        int temp, j;

        for (int interval = length / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < length; i++) {
                temp = array[i];
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval)
                    array[j] = array[j - interval];
                array[j] = temp;
            }
        }
    }
}
