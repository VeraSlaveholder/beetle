package a1;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fac(3));
    }

    public static int fac(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }
}
