package Litcode;

public class LengthOfLastWord58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World         "));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;
    }
}
