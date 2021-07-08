package sorting;

public class MergeSort {

    private static void merge(int[] array, int beginInd, int middleInd, int endInd) {
        int leftPointer = 0;
        int rightPointer = 0;
        int[] leftArray = new int[middleInd - beginInd + 1];
        int[] rightArray = new int[endInd - middleInd];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[beginInd + i];

        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[middleInd + 1 + i];

        for (int i = beginInd; i <= endInd; i++) {
            if (rightPointer == rightArray.length)
                array[i] = leftArray[leftPointer++];
            else if (leftPointer == leftArray.length)
                array[i] = rightArray[rightPointer++];
            else if (leftArray[leftPointer] < rightArray[rightPointer])
                array[i] = leftArray[leftPointer++];
            else
                array[i] = rightArray[rightPointer++];
        }
    }

    private static void sortPart(int[] array, int beginInd, int endInd) {
        if (beginInd < endInd) {
            int middleInd = (endInd + beginInd) / 2;
            sortPart(array, beginInd, middleInd);
            sortPart(array, middleInd + 1, endInd);
            merge(array, beginInd, middleInd, endInd);
        }
    }

    public static void sort(int[] array) {
        sortPart(array, 0, array.length - 1);
    }
}
