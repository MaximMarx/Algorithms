import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SumArrayTest {

    @Order(1)
    @Test
    public void sumArrayHappyPathPositiveNumbers(){
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void sumArrayHappyPathNegativeNumbers(){
        int[] array = {-7, -3};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void sumArrayZeroIndex(){
        int[] array = {};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }


}
