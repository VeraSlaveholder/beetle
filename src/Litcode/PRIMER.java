package Litcode;

public class PRIMER {
    public static void main(String[] args) {
        String stones = "AaaAagGqAAqAAA";
        String jewels = "Ag";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0;

        for (char stone : stones.toCharArray()) {
            for (char jewel : jewels.toCharArray()) {
                if (jewel == stone) {
                    result++;
                }
            }
        }
        return result;
    }
}
