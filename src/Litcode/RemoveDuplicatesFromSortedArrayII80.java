package Litcode;

public class RemoveDuplicatesFromSortedArrayII80 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));// 5, nums = [1,1,2,2,3,_]
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));//7, nums = [0,0,1,1,2,3,3,_,_]
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1, counter = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                counter++;
            } else counter = 0;
            if (counter <= 1) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
