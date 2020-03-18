package fourfunctioncalc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    //integer tests
    fourfunctioncalc.AddIntTest.class,
    fourfunctioncalc.SubtractIntTest.class,
    fourfunctioncalc.MultiplyIntTest.class,
    fourfunctioncalc.DivideIntTest.class,    
    //double tests
    fourfunctioncalc.AddDoubleTest.class, 
    fourfunctioncalc.SubtractDoubleTest.class, 
    fourfunctioncalc.MultiplyDoubleTest.class, 
    fourfunctioncalc.DivideDoubleTest.class 
})

public class FourFunctionCalcTestSuite {
    
}

