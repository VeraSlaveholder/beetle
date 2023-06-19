package Litcode;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));//"III"
        System.out.println(intToRoman(1994));//"MCMXCIV"
        System.out.println(intToRoman(58));//"LVIII"
    }

    public static String intToRoman(int num) {
        int[] numbers = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] str = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length && num > 0; i++) {
            while (num >= numbers[i]) {
                num -= numbers[i];
                sb.append(str[i]);
            }
        }
        return sb.toString();

    }
}
