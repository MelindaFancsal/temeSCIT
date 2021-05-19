import calculator.CalculatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import shoppingcart.ShoppingCartTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorTest.class, ShoppingCartTest.class})
public class TestSuite {
}
