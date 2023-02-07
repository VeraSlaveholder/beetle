package JavaStepic.task1.Task23;

public class IsPalindrome {
    public static boolean isPalindrome(String text) {
        String newText=text.replaceAll("[^A-Za-z1-9]+", "");
        byte a = 1;
        byte b = 2;
        byte c = (byte) (a + b);

        return newText.equalsIgnoreCase(new StringBuilder(newText).reverse().toString());
    }
}
