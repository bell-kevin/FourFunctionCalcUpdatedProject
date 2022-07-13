package fourfunctioncalc;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SubtractDoubleTest {

    @Parameterized.Parameter(0)
    public double num1;
    @Parameterized.Parameter(1)
    public double num2;
    @Parameterized.Parameter(2)
    public double result;

    //test data for testAdd
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
            {15.99, -53.01, 69.00}, //test case 1
            {-11.01, 6.99, -18.00}, //test case 2
            {45.99, 65.99, -20.00}, //test case 3
            {-22.01, -44.01, 22.00}, //test case 4
            {-99.99, 34.99, -134.98}, //test case 5
            {99.99, 55.99, 44.00}, //test case 6
            {27.99, -99.99, 127.98}, //test case 7
            {68.99, 99.99, -31.00}, //test case 8
            {24.99, 76.99, -52.00}, //test case 9
            {76.99, 24.99, 52.00}, //test case 10
            {0, 68.99, -68.99}, //test case 11
            {68.99, 0, 68.99}, //test case 12
            {71, 25.2, 45.80}, //test case 13
            {65.2, 18, 47.20} //test case 14   
        };
        return Arrays.asList(data);
    } //end Collection--data

    @Test
    public void testAdd() {
        System.out.println("subtract doubles");
        assertEquals(result, FourFunctionCalc.subtract(num1, num2), .01);
    } //end testAdd
} //end class SubtractDoubleTest
