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
public class DivideDoubleTest {
    
    @Parameterized.Parameter(0)
    public double num1;
    @Parameterized.Parameter(1)
    public double num2;
    @Parameterized.Parameter(2)
    public double result;
    
    //test data for testAdd
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
            { 15.99, -53.01, -0.30}, //test case 1
            {-11.01,   6.99, -1.58}, //test case 2
            { 45.99,  65.99,  0.70}, //test case 3
            {-22.01, -44.01,  0.50}, //test case 4
            {-99.99,  34.99, -2.86}, //test case 5
            { 99.99,  55.99,  1.79}, //test case 6
            { 27.99, -99.99, -0.28}, //test case 7
            { 68.99,  99.99,  0.69}, //test case 8
            { 24.99,  76.99,  0.32}, //test case 9
            { 76.99,  24.99,  3.08}, //test case 10
            {     0,  68.99,  0.00}, //test case 11
            {     0, -67.01,  0.00}, //test case 12
            {    71,   25.2,  2.82}, //test case 13
            {  65.2,     18,  3.62}  //test case 14 
        };
        return Arrays.asList(data);
    } //end Collection--data
    
    @Test
    public void testAdd() {
        System.out.println("divide doubles");
        assertEquals(result, FourFunctionCalc.divide(num1, num2), .01);
    } //end testAdd

} //end class DivideDoubleTest

