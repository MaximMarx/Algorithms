import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    @Test
    public void areNumbersEqualHappyPathResultAreZero(){
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void areNumbersEqualHappyPathResultAreMinusOne(){
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void areNumbersEqualHappyPathResultIsOne(){
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void areNumbersEqualTwoZero(){
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void areNumbersEqualSecondZero(){
        int a = 89;
        int b = 0;
        int expectedResult = 1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
