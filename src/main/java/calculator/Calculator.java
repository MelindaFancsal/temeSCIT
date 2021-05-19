package calculator;

public class Calculator {

    public int sumaNumereIntregi(int a, int b) {
        return a + b;
    }

    public float impartireNumere(int a, int b) {
        if (isNumerZero(b)) {
            return (float) 0.0;
        }

        float resultat = (float) a / b;
        return resultat;
    }

    private boolean isNumerZero(int numar) {
        if (numar == 0) {
            return true;
        }

        return false;
    }

    public int sum(String expression) {
        int sum = 0;
        String[] intValues = expression.split("\\+");
        for (String values : intValues) {
            sum += Integer.valueOf(values);
        }

        return sum;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
