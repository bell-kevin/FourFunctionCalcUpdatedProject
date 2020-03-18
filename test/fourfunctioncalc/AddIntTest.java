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
public class AddIntTest {
    
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
            { 15, -54, -39}, //test case 1
            {-12,   6,  -6}, //test case 2
            { 45,  65, 110}, //test case 3
            {-23, -45, -68}, //test case 4
            {-99,  34, -65}, //test case 5
            { 99,  55, 154}, //test case 6
            { 27, -99, -72}, //test case 7
            { 68,  99, 167}, //test case 8
            { 24,  76, 100}, //test case 9
            { 76,  24, 100}, //test case 10
            {  0,  68,  68}, //test case 11
            { 68,   0,  68}  //test case 12    
        };
        return Arrays.asList(data);
    } //end Collection--data
    
    @Test
    public void testAdd() {
        System.out.println("add");
        assertEquals(result, FourFunctionCalc.add(num1, num2));
    } //end testAdd

} //end class AddIntTest

