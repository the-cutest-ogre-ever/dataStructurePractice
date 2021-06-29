package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public static int getMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++)
            max = array[i] > max ? array[i] : max;
        while (max % 10 != 0)
            max++;
        return max;
    }

    public static int getMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++)
            min = array[i] < min ? array[i] : min;
        while (min % 10 != 0)
            min--;
        return min;
    }

    public static int getBucketInd(int num, int bound) {
        while (num % 10 != 0)
            num--;
        return bound < 0 ? (num / 10 - bound) : (num / 10);
    }

    public static void sort(int[] array) {
        int minBound = getMin(array) / 10;
        int bucketsCount = (getMax(array) / 10) - minBound + 1;

        ArrayList<Integer>[] buckets = new ArrayList[bucketsCount];
        for (int i = 0; i < bucketsCount; i++)
            buckets[i] = new ArrayList<Integer>();

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
