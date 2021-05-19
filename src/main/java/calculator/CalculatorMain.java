package calculator;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.sum("1+2+3");

        System.out.println(result);

      //  int divideResult = calculator.divide(1,0);
    }
}
