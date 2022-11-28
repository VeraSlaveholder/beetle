package Litcode;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 1, 3, 2, 2, 2, 5, 4, 8, 9, 6, 7, 10};

        System.out.println(Arrays.toString(shuffle(array, array.length / 2)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] baseArray = new int[nums.length];
        int[] firstPart = new int[n];
        int[] secondPart = new int[n];


       /* for(int i = 0; i< nums.length; i++){
            if(i<n){
                firstPart[i]=nums[i];
            }else {
                secondPart[i-n]=nums[i];
            }
        }*/
        firstPart = Arrays.copyOfRange(nums, 0, n);
        secondPart = Arrays.copyOfRange(nums, n, nums.length);
        int z = 0;
        for (int i = 0; i < baseArray.length; i += 2) {
            baseArray[i] = firstPart[z];
            baseArray[i + 1] = secondPart[z];
            z++;

        }
        return baseArray;
    }
}



