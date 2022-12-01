package Task23;

public class IsPalindrome {
    public static boolean isPalindrome(String text) {
        String newText=text.replaceAll("[^A-Za-z1-9]+", "");
        return newText.equalsIgnoreCase(new StringBuilder(newText).reverse().toString());
    }
}
