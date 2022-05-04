import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class mPerformTest {

    @Order(1)
    @Test
    public void mPerformHappyPathGoodNumber(){
        int m = 15;
        String expectedResult = "Good number";

        mPerform mp = new mPerform();
        String actualResult = mp.mPerform(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void mPerformHappyPathBadNumber(){
        int m = 9;
        String expectedResult = "Bad number";

        mPerform mp = new mPerform();
        String actualResult = mp.mPerform(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void mPerformHappyPathPoorNumber(){
        int m = 20;
        String expectedResult = "Poor number";

        mPerform mp = new mPerform();
        String actualResult = mp.mPerform(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void mPerformHappyPathMinusOne(){
        int m = -1;
        String expectedResult = "-1";

        mPerform mp = new mPerform();
        String actualResult = mp.mPerform(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
