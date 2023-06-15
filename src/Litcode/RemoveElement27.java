package Litcode;

public class RemoveElement27 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3)); //2, nums = [2,2,_,_]
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2)); //5, nums = [0,1,4,0,3,_,_,_]
    }

    public static int removeElement(int[] nums, int val) {
        int counter = nums.length;
        int k=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==val){
                counter--;
            }else{
                nums[k++]=nums[i];
            }
        }
        return counter;
    }
}
