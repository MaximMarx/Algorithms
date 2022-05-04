import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    @Test
    public void minMaxAveHappyPath(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array,index1,index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void minMaxAveHappyPathMinus(){
        int[] array = {-1, -2, -3, -4, -5, -6, -7, -8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {-7, -3, -5};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array,index1,index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void minMaxAveOddArray(){
        int[] array = {1, 2, 0, 4, 5, 6, 7, 8,9};
        int index1 = 2;
        int index2 = 8;
        int[] expectedResult = {0, 9, 5};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array,index1,index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
