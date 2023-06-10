package Litcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 1, -2, -4, 0}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else set.add(num);
        }
        return false;
    }
}
