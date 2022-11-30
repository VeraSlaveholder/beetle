package Task34;

import java.util.function.DoubleUnaryOperator;

public class Integration {

    public static void main(String[] args) {

        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate(x -> Math.sin(x) / x, 1, 5));//0.603848
    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double result = 0;
        double numberOfPartitions = Math.pow(10, 8);
        double step = (b - a) / numberOfPartitions;
        for (int i = 0; i < numberOfPartitions; i++) {
            result += f.applyAsDouble(a + step * (i + 0.5));
        }
        result *= step;
        return result;
    }
}
