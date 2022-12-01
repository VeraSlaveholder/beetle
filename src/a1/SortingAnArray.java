package a1;

public class SortingAnArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 6, 7, 2, 4, 5, 9, 8, 7, 10, 2};
        printOddNumbers(arr1);
    }

    public static void printOddNumbers(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (flag) {
                    System.out.print(arr[i]);
                    flag = false;
                } else {
                    System.out.print(", " + arr[i]);
                }
            }
        }
        System.out.println();
    }
}
