package JavaStepic.task1.task4;

public class BitFlip {
    public static void main(String[] args) {

    }
    public static int flipBit(int value, int bitIndex) {
        return value ^ 1 << bitIndex - 1;
    }
}
