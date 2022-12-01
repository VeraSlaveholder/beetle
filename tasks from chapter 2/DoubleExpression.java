package task3;

public class DoubleExpression {
    public static void main(String[] args) {

    }
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) < 0.000000001;
    }
}
