package Litcode;

import java.util.Arrays;

public class PlusOne66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 1, 1, 1, 2})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{1, 9, 9, 9})));
    }

    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        while (digits[index] == 9) {
            digits[index] = 0;
            index--;
            if (index < 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
                break;
            }
        }
        if (index >= 0) {
            digits[index]++;
        }
        return digits;
    }
}
