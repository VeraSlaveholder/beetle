package Task31;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] firstArray={2,5,9};
        int[] secondArray={1,5};
        System.out.println(Arrays.toString(mergeArrays(firstArray, secondArray)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] answer = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;

        while (i < a1.length && j < a2.length)
            answer[k++] = a1[i] < a2[j] ? a1[i++] : a2[j++];

        while (i < a1.length)
            answer[k++] = a1[i++];

        while (j < a2.length)
            answer[k++] = a2[j++];

        return answer;
    }
}
