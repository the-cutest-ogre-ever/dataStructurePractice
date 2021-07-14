package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    private static int getBucketInd(int num, int bound) {
        while (num % 10 != 0)
            num--;
        return bound < 0 ? (num / 10 - bound) : (num / 10);
    }

    public static void sort(int[] array) {
        int minBound = SortingUtils.getMinDecimal(array) / 10;
        int bucketsCount = (SortingUtils.getMaxDecimal(array) / 10) - minBound + 1;

        ArrayList<Integer>[] buckets = new ArrayList[bucketsCount];
        for (int i = 0; i < bucketsCount; i++)
            buckets[i] = new ArrayList<>();

        System.out.println("\n");

        for (int i = 0; i < array.length; i++)
            buckets[getBucketInd(array[i], minBound)].add(array[i]);

        for (int i = 0; i < bucketsCount; i++)
            Collections.sort(buckets[i]);

        int ind = 0;
        for (int i = 0; i < bucketsCount; i++) {
            for (int j = 0; j < buckets[i].size(); j++)
                array[ind++] = buckets[i].get(j);
        }
    }
}
