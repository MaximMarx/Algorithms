import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OddIndicesTest {

    @Order(1)
    @Test
    public void oddIndicesHappyPath() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void oddIndicesHappyPathOddIndex_1() {
        int[] array = {-45, 590, 234, 985, 12};
        int[] expectedResult = {590, 985};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void oddIndicesHappyPathOddIndex_2() {
        int[] array = {-45, 590, 234, 985, 12, 13, 13, 13, 13};
        int[] expectedResult = {590, 985, 13, 13};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
