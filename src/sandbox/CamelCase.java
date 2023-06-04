package sandbox;

public class CamelCase {
    private final String q = "-";
    private final String q2 = "_";

    public static void main(String[] args) {
        System.out.println(toCamelCase("the_Stealth-warrior"));
    }

    static String toCamelCase(String s) {
        while(s.contains("_")||s.contains("-")) {
            s = s.replaceFirst("_.", String.valueOf(Character.toUpperCase(s.charAt(s.indexOf("_") + 1))));
            s = s.replaceFirst("-.", String.valueOf(Character.toUpperCase(s.charAt(s.indexOf("-") + 1))));
        }
        return s;
//        if (s.length() == 0)
//            return s;
//        return s1[0] + ''.join(i.capitalize() for i in s[1:])
    }
}
