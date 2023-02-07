package JavaStepic.task1.Task53;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = 0;
        while (scanner.hasNext()) {
            try {
                d += Double.parseDouble(scanner.next());
            } catch (Exception e) {
            }
        }
        System.out.format("%.6f", d);
    }
}
