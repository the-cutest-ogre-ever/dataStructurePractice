import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sorting.BubbleSort;
import sorting.InsertionSort;

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
        int[] resultArray = BubbleSort.sort(sourceArray);
        Assertions.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    void InsetrionSortTest() {
        int[] resultArray = InsertionSort.sort(sourceArray);
        Assertions.assertArrayEquals(expectedArray, resultArray);
    }
}
