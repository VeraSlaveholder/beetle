package Litcode;

public class PalindromeNumber9 {
    public static void main(String[] args) {
        System.out.println(reverse(-121));
    }

    public static boolean reverse(int x) {

        int start = x;
        int result = 0;
        int pop = 0;
        while (x > 0) {
            pop = x % 10;
            x = x / 10;
            result = result * 10 + pop;
        }
        if (start == result) return true;
        else return false;
    }
}
