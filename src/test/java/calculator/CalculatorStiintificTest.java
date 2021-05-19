package calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorStiintificTest extends CalculatorTest{

    @Before
    public void setUp() throws Exception {
        System.out.println("before test method");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after test method");
    }

    @Test
    public void testSum() {

    }
}
