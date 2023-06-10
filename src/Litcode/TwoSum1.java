package Litcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int requiredNum = target - nums[i];
            if (map.containsKey(requiredNum) && map.get(requiredNum) != i) {
                return new int[]{i, map.get(requiredNum)};
            }
        }
        throw new IllegalArgumentException("Нет такого решения");
    }
}
