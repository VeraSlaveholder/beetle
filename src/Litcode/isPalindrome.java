package Litcode;

public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(Solution.isPalindrome(15251));
    }

    class Solution {
        public static boolean isPalindrome(int x) {
            String s = "" + x;
            char[] a = s.toCharArray();
            int i1 = 0;
            int i2 = a.length - 1;
            while (i2 > i1) {
                if (a[i1] != a[i2]) {
                    return false;
                }
                ++i1;
                --i2;
            }
            return true;
        }
    }
}
