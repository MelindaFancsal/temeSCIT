package calculator;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CalculatorTest extends TestCase {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        System.out.println("before test method");
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after test method");
        calculator = null;
    }

    @Test
    public void testSumaNumere() {
        int resultat = calculator.sumaNumereIntregi(1, 2);
        assertEquals(3, resultat);
    }

    @Test
    public void testImpartireNr() {
        int a = 2;
        int b = 4;
        float expected = (float) 0.5;
        float resultat = calculator.impartireNumere(a,b);
        assertEquals(expected, resultat);
    }

    @Test
    public void testImpartireCuZero() {
        int a = 2;
        int b = 0;
        float expected = (float) 0.0;
        float result = calculator.impartireNumere(a,b);
        assertEquals(expected, result);
    }
//    @Test
//    public void testSum() {
//        int resultat = calculator.sum("1+2+3");
//        //assertEqual (expected, actual)
//        assertEquals(6, resultat);
//    }

//    @Test
//    public void testSumForInt(){
//        int resultat = calculator.sum(1,2);
//        assertEquals(3,3);
//    }
//
//    @Test(expected=ArithmeticException.class)
//    public void testDevide() {
//        int resultat = calculator.divide(1,0);
//    }
}