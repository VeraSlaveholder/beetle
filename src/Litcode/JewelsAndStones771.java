package Litcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        Set<Character> set = new HashSet<>();
        for (Character c : jewels.toCharArray()) {
            set.add(c);
        }
        for (Character c : stones.toCharArray()) {
            if (set.contains(c)) {
                result++;
            }
        }
        return result;
    }
}
