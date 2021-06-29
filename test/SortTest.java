import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sorting.*;

public class SortTest {

    private static int[] sourceArrayPositive;
    private static int[] expectedArrayPositive;

    private static int[] sourceArrayMixed;
    private static int[] expectedArrayMixed;

    @BeforeAll
    public static void setUp() {
        sourceArrayPositive = new int[]{52, 9, 67, 1, 15, 122, 32, 17, 0, 98};
        expectedArrayPositive = new int[]{0, 1, 9, 15, 17, 32, 52, 67, 98, 122};

        sourceArrayMixed = new int[]{56, -9, 4, 2, 0, -1, 48, -11, 55, 32};
        expectedArrayMixed = new int[]{-11, -9, -1, 0, 2, 4, 32, 48, 55, 56};
    }

    @Test
    void BubbleSortTest() {
        BubbleSort.sort(sourceArrayPositive);
        Assertions.assertArrayEquals(expectedArrayPositive, sourceArrayPositive);

        BubbleSort.sort(sourceArrayMixed);
        Assertions.assertArrayEquals(expectedArrayMixed, sourceArrayMixed);
    }

    @Test
    void InsertionSortTest() {
        InsertionSort.sort(sourceArrayPositive);
        Assertions.assertArrayEquals(expectedArrayPositive, sourceArrayPositive);

        InsertionSort.sort(sourceArrayMixed);
        Assertions.assertArrayEquals(expectedArrayMixed, sourceArrayMixed);
    }

    @Test
    void SelectionSortTest() {
        int minInd = SelectionSort.getMinInd(sourceArrayPositive, 4, sourceArrayPositive.length);
        Assertions.assertEquals(8, minInd);

        SelectionSort.sort(sourceArrayPositive);
        Assertions.assertArrayEquals(expectedArrayPositive, sourceArrayPositive);

        SelectionSort.sort(sourceArrayMixed);
        Assertions.assertArrayEquals(expectedArrayMixed, sourceArrayMixed);
    }

    @Test
    void CountingSortTest() {
        int max = CountingSort.getMax(sourceArrayPositive);
        Assertions.assertEquals(122, max);

        CountingSort.sort(sourceArrayPositive);
        Assertions.assertArrayEquals(expectedArrayPositive, sourceArrayPositive);
    }

    @Test
    void BucketSortTest() {
        BucketSort.sort(sourceArrayPositive);
        Assertions.assertArrayEquals(expectedArrayPositive, sourceArrayPositive);

        BucketSort.sort(sourceArrayMixed);
        Assertions.assertArrayEquals(expectedArrayMixed, sourceArrayMixed);
    }
}
