import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sorting.*;

public class SortingUtilsTest {

    private static int[] sourceArrayPositive;
    private static int[] sourceArrayMixed;

    @BeforeEach
    public void setUp() {
        sourceArrayPositive = new int[]{52, 9, 67, 1, 15, 122, 32, 17, 0, 98};
        sourceArrayMixed = new int[]{56, -9, 4, 2, 0, -1, 48, -11, 55, 32};
    }

    @Test
    void swapTest() {
        int[] expectedArrayPositive = new int[]{52, 9, 0, 1, 15, 122, 32, 17, 67, 98};
        int[] expectedArrayMixed = new int[]{-11, -9, 4, 2, 0, -1, 48, 56, 55, 32};

        SortingUtils.swap(sourceArrayPositive, 2, 8);
        Assertions.assertArrayEquals(expectedArrayPositive, sourceArrayPositive);

        SortingUtils.swap(sourceArrayMixed, 0, 7);
        Assertions.assertArrayEquals(expectedArrayMixed, sourceArrayMixed);
    }

    @Test
    void getMaxTest() {
        Assertions.assertEquals(122, SortingUtils.getMax(sourceArrayPositive));
        Assertions.assertEquals(56, SortingUtils.getMax(sourceArrayMixed));
    }

    @Test
    void getMaxDecimalTest() {
        Assertions.assertEquals(130, SortingUtils.getMaxDecimal(sourceArrayPositive));
        Assertions.assertEquals(60, SortingUtils.getMaxDecimal(sourceArrayMixed));
    }

    @Test
    void getMinDecimalTest() {
        Assertions.assertEquals(0, SortingUtils.getMinDecimal(sourceArrayPositive));
        Assertions.assertEquals(-20, SortingUtils.getMinDecimal(sourceArrayMixed));
    }

    @Test
    void getMinIndTest() {
        Assertions.assertEquals(8, SortingUtils.getMinInd(sourceArrayPositive, 0, sourceArrayPositive.length));
        Assertions.assertEquals(7, SortingUtils.getMinInd(sourceArrayMixed, 0, sourceArrayMixed.length));
    }
}