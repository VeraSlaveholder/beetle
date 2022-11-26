package task3;

public class DoubleExpression {
    public static void main(String[] args) {
    }
    public static boolean doubleExpression(double a, double b, double c) {
        if(Math.abs((a+b)-c)<0.000000001){
            return true;
        } else {
            return false;
        }
    }
}
