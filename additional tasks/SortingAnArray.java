package a1;

public class SortingAnArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 6, 7, 2, 4, 5, 9, 8, 7, 10, 2};
        printOddNumbers(arr1);
    }

    public static void printOddNumbers(int[] arr) {
        boolean flag = true;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 2 != 0) {
                if (flag) {
                    System.out.print(arr[x]);
                    flag = false;
                } else {
                    System.out.print(", " + arr[x]);
                }
            }
        }
        System.out.println();
    }
}
