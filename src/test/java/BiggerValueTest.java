import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BiggerValueTest {

    @Order(1)
    @Test
    public void biggerValueHappyPath(){
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bg = new BiggerValue();
        int actualResult = bg.biggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

}
