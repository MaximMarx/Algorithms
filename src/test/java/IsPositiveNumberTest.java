import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IsPositiveNumberTest {

    @Order(1)
    @Test
    public void isPositiveNumberHappyPathTrue(){
        int a = 555;
        boolean expectedResult = true;

        IsPositiveNumber isp = new IsPositiveNumber();
        boolean actualResult = isp.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void isPositiveNumberHappyPathTrueWithZero(){
        int a = 0;
        boolean expectedResult = true;

        IsPositiveNumber isp = new IsPositiveNumber();
        boolean actualResult = isp.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void isPositiveNumberHappyPathFalse(){
        int a = -555;
        boolean expectedResult = false;

        IsPositiveNumber isp = new IsPositiveNumber();
        boolean actualResult = isp.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
