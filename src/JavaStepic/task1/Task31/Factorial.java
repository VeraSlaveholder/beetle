package JavaStepic.task1.Task31;
import java.math.BigInteger;
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3));

    }
    public static BigInteger factorial(int value) {
        BigInteger factorials = BigInteger.ONE;
        for(int i=1;i<=value;i++){
            factorials=factorials.multiply(BigInteger.valueOf(i));
        }
        return factorials;
    }
}
