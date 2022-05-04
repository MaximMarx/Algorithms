import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OddEvenTest {

    @Order(1)
    @Test
    public void testOddEvenHappyPathOdd() {
        int number = -345;
        String expectedResult = "Odd";

        OddEven oe = new OddEven();
        String actualResult = oe.OddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathEvenZero() {
        int number = 0;
        String expectedResult = "Even";

        OddEven oe = new OddEven();
        String actualResult = oe.OddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathEven() {
        int number = 222222;
        String expectedResult = "Even";

        OddEven oe = new OddEven();
        String actualResult = oe.OddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathUndefined() {
        int number = 2147483647 + 1;
        String expectedResult = "Undefined";

        OddEven oe = new OddEven();
        String actualResult = oe.OddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
