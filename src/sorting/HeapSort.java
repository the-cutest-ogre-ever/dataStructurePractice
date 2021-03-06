package sorting;

public class HeapSort {

    private static void heapify(int[] array, int length, int i) {
        int largest = i;
        int leftNode = 2 * i + 1;
        int rightNode = 2 * i + 2;

        if (leftNode < length && array[leftNode] > array[largest])
            largest = leftNode;
        if (rightNode < length && array[rightNode] > array[largest])
            largest = rightNode;

        if (largest != i) {
            SortingUtils.swap(array, i, largest);
            heapify(array, length, largest);
        }
    }

    public static void sort(int[] array) {
        int length = array.length;

        for (int i = length / 2 - 1; i >= 0; i--)
            heapify(array, length, i);
        for (int i = length - 1; i >= 0; i--) {
            SortingUtils.swap(array, 0, i);
            heapify(array, i, 0);
        }
    }
}
