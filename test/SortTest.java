import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sorting.BubbleSort;
import sorting.InsertionSort;
import sorting.SelectionSort;

public class SortTest {

    private static int[] sourceArray;
    private static int[] expectedArray;

    @BeforeAll
    public static void setUp() {
        sourceArray = new int[]{52, 9, 67, 1, 15, 122, 32, 17, 0, 98};
        expectedArray = new int[]{0, 1, 9, 15, 17, 32, 52, 67, 98, 122};
    }

    @Test
    void BubbleSortTest() {
        BubbleSort.sort(sourceArray);
        Assertions.assertArrayEquals(expectedArray, sourceArray);
    }

    @Test
    void InsertionSortTest() {
        InsertionSort.sort(sourceArray);
        Assertions.assertArrayEquals(expectedArray, sourceArray);
    }

    @Test
    void SelectionSortTest() {
        int minInd = SelectionSort.getMinInd(sourceArray, 4, sourceArray.length);
        Assertions.assertEquals(8, minInd);

        SelectionSort.sort(sourceArray);
        Assertions.assertArrayEquals(expectedArray, sourceArray);
    }
}
