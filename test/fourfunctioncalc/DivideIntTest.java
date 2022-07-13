package fourfunctioncalc;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivideIntTest {

    @Parameterized.Parameter(0)
    public int num1;
    @Parameterized.Parameter(1)
    public int num2;
    @Parameterized.Parameter(2)
    public int result;

    //test data for testAdd
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
            //test case 1
            {15, -54, 0}, //test case 1
            {-12, 6, -2}, //test case 2
            {45, 65, 0}, //test case 3
            {-23, -45, 0}, //test case 4
            {-99, 34, -2}, //test case 5
            {99, 55, 1}, //test case 6
            {27, -99, 0}, //test case 7
            {68, 99, 0}, //test case 8
            {24, 76, 0}, //test case 9
            {76, 24, 3}, //test case 10
            {0, 68, 0}, //test case 11
            {0, -68, 0} //test case 12    
        };
        return Arrays.asList(data);
    } //end Collection--data

    @Test
    public void testAdd() {
        System.out.println("divide");
        assertEquals(result, FourFunctionCalc.divide(num1, num2));
    } //end testAdd
} //end class DivideIntTest
