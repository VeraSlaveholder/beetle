package JavaStepic.task1.Task21;

public class CharExpression {
    public static void main(String[] args) {
        System.out.println(charExpression(29));
    }
    public static char charExpression(int a) {
        return (char)((int)'\\'+a);
    }
}
