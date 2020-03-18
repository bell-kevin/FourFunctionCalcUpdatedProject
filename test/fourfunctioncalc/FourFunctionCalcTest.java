package fourfunctioncalc;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class FourFunctionCalcTest {
    
    @Parameterized.Parameter(0)
    public int num1;
    @Parameterized.Parameter(1)
    public int num2;
    @Parameterized.Parameter(2)
    public int result;
    
    //test data for testAdd
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
            //test case 1
            {1, 1, 2}, //test case 1
            {1.5, 1.6, 3.1} //test case 2
                
        };
        return Arrays.asList(data);
    } //end Collection--data
    
    @Test
    public void testAdd() {
        System.out.println("add");
        assertEquals(result, FourFunctionCalc.add(num1, num2));
    } //end testAdd

} //end class FourFunctionCalcTest

    
    
    /*
    
    
    
    
    
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        assertEquals(69, FourFunctionCalc.subtract(15, -54)); //test case 1
        assertEquals(-18, FourFunctionCalc.subtract(-12, 6)); //test case 2
        assertEquals(-20, FourFunctionCalc.subtract(45, 65)); //test case 3
        assertEquals(22, FourFunctionCalc.subtract(-23, -45)); //test case 4
        assertEquals(-133, FourFunctionCalc.subtract(-99, 34)); //test case 5
        assertEquals(44, FourFunctionCalc.subtract(99, 55)); //test case 6
        assertEquals(126, FourFunctionCalc.subtract(27, -99)); //test case 7
        assertEquals(-31, FourFunctionCalc.subtract(68, 99)); //test case 8
        assertEquals(-52, FourFunctionCalc.subtract(24, 76)); //test case 9
        assertEquals(52, FourFunctionCalc.subtract(76, 24)); //test case 10
    } //end testSubtract

    @Test
    public void testMultiply() {
        System.out.println("multiply");
        assertEquals(-810, FourFunctionCalc.multiply(15, -54)); //test case 1
        assertEquals(-72, FourFunctionCalc.multiply(-12, 6)); //test case 2
        assertEquals(2925, FourFunctionCalc.multiply(45, 65)); //test case 3
        assertEquals(1035, FourFunctionCalc.multiply(-23, -45)); //test case 4
        assertEquals(-3366, FourFunctionCalc.multiply(-99, 34)); //test case 5
        assertEquals(5445, FourFunctionCalc.multiply(99, 55)); //test case 6
        assertEquals(-2673, FourFunctionCalc.multiply(27, -99)); //test case 7
        assertEquals(6732, FourFunctionCalc.multiply(68, 99)); //test case 8
        assertEquals(1824, FourFunctionCalc.multiply(24, 76)); //test case 9
        assertEquals(1824, FourFunctionCalc.multiply(76, 24)); //test case 10
    } //end testMultiply

    @Test
    public void testDivide() {
        System.out.println("divide");
        assertEquals(-0.27, FourFunctionCalc.divide(15, -54), .01); //test case 1
        assertEquals(-2.00, FourFunctionCalc.divide(-12, 6), .01); //test case 2
        assertEquals(0.69, FourFunctionCalc.divide(45, 65), .01); //test case 3
        assertEquals(0.51, FourFunctionCalc.divide(-23, -45), .01); //test case 4
        assertEquals(-2.91, FourFunctionCalc.divide(-99, 34), .01); //test case 5
        assertEquals(1.80, FourFunctionCalc.divide(99, 55), .01); //test case 6
        assertEquals(-0.27, FourFunctionCalc.divide(27, -99), .01); //test case 7
        assertEquals(0.68, FourFunctionCalc.divide(68, 99), .01); //test case 8
        assertEquals(0.31, FourFunctionCalc.divide(24, 76), .01); //test case 9
        assertEquals(3.16, FourFunctionCalc.divide(76, 24), .01); //test case 10
    } //end testDivide

*/

