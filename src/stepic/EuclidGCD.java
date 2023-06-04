package stepic;

import java.util.Scanner;

public class EuclidGCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        EuclidGCD euclidGCD = new EuclidGCD();
        System.out.println(euclidGCD.euclidGCD(num1, num2));

    }

    public int euclidGCD(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        } else if (num2 == 0) {
            return num1;
        } else if (num1 >= num2) {
            return euclidGCD(num1 % num2, num2);
        } else if (num1 <= num2) {
            return euclidGCD(num1, num2 % num1);
        } else return 0;
    }
}
